package xyz.reitmaier.kinputevents

import java.io.DataInputStream
import java.io.FileInputStream
import java.io.IOException

typealias OnInputEventListener = (event: InputEvent) -> Unit

class KInputEvents(private val inputDevicePath: String) {
    private var dis: DataInputStream? = null
    private var running = false
    private var readerThread: Thread? = null
    private var listeners: ArrayList<OnInputEventListener> = ArrayList()

    private val is64Bit = System.getProperty("os.arch").contains("64")

    /*
    Input Event Layout
    See Linux Kernel Event Interface
    https://www.kernel.org/doc/Documentation/input/input.txt
     */
    private val inputEventSize = if(is64Bit) 24 else 16
    private val inputEventData = ByteArray(inputEventSize)
    private val timeStructSize = if(is64Bit) 16 else 8 // Includes seconds & microsecond
    private val secondsIndex = 0
    private val microSecondsIndex = if(is64Bit) 8 else 4
    private val typeIndex = if(is64Bit) 16 else 8
    private val codeIndex = if(is64Bit) 18 else 10
    private val valueIndex = if(is64Bit) 20 else 12

    fun start() {
        // Check if reader thread is alive
        if(readerThread?.isAlive == true) {
            throw Exception("${this.javaClass.simpleName} is already started.")
        }
        // (Close existing and) create new DataInputStream
        dis?.close()
        dis = DataInputStream(FileInputStream(inputDevicePath))

        // Create & start reader thread
        running = true
        readerThread = Thread { poll() }
        readerThread?.isDaemon = true
        readerThread?.start()
    }

    fun exit() {
        running = false
        try {
            //Wait for the reader thread to stop
            readerThread?.join()
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        try {
            //Close the input device stream
            dis?.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    private fun poll() {
        try {
            while (running) {
                // read input event Data
                dis?.readFully(inputEventData)

                // parse input event data
                val seconds = inputEventData.getNumericValueAt(secondsIndex, timeStructSize / 2)
                val microseconds = inputEventData.getNumericValueAt(microSecondsIndex, timeStructSize / 2)
                val timestamp = "${seconds}.$microseconds"

                val type = inputEventData.getNumericValueAt(typeIndex, 2).toInt()
                val code = inputEventData.getNumericValueAt(codeIndex, 2).toInt()
                val value = inputEventData.getNumericValueAt(valueIndex, 4).toInt()

                // distribute the event to listeners
                synchronized(listeners) {
                    listeners.forEach { it(InputEvent(timestamp, type, code, value)) }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    fun addListener(listener: OnInputEventListener) {
        synchronized(listeners) {
            listeners.add(listener)
        }
    }

    fun removeListener(listener: OnInputEventListener) {
        synchronized(listeners) {
            listeners.remove(listener)
        }
    }

    //Helper function to read an unsigned number from a bytearray
    private fun ByteArray.getNumericValueAt(idx: Int, length: Int) : Long {
        var value: Long = 0
        for (i in idx until length+idx) {
            value += this[i].toLong() and 0xffL shl 8 * (i - idx)
        }
        return value
    }


}

data class InputEvent(val timestamp: String, val type: Int, val code: Int, val value: Int) {
    override fun toString() =
            when (type) {
                EV_KEY -> "Event: Time $timestamp," +
                        " type $type (${EVENT_TYPES[type].orEmpty()})," +
                        " code $code (${KEYCODES[code].orEmpty()})," +
                        " value $value (${EV_KEY_VALUES[value].orEmpty()})"
                else -> "Event: Time $timestamp, type $type , code $code, value $value"
            }
}
