package xyz.reitmaier.kinputevents

import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.channels.AsynchronousCloseException
import java.nio.channels.FileChannel
import java.nio.channels.ReadableByteChannel
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import java.util.concurrent.atomic.AtomicBoolean


//typealias OnInputEventListener = (event: InputEvent) -> Unit
interface KInputEventListener {
  fun onEvent(event: InputEvent)
  fun onException(exception: Exception)
  fun onExit()
}

class KInputEvents(private val inputDevicePath: String) {
  private var fileChannel: ReadableByteChannel? = null
  private val running = AtomicBoolean(false)
  private var readerThread: Thread? = null
  private var listeners: ArrayList<KInputEventListener> = ArrayList()

  private val is64Bit = System.getProperty("os.arch").contains("64")

  /*
  Input Event Layout
  See Linux Kernel Event Interface
  https://www.kernel.org/doc/Documentation/input/input.txt
   */
  private val inputEventSize = if(is64Bit) 24 else 16
  private val inputEventData = ByteBuffer.allocate(inputEventSize)
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
    // (Close existing and) create new FileChannel
    fileChannel?.close()
    fileChannel = FileChannel.open(Paths.get(inputDevicePath), StandardOpenOption.READ)

    // Create & start reader thread
    running.set(true)
    readerThread = Thread { poll() }
    readerThread?.isDaemon = true
    readerThread?.start()
  }

  fun exit() {
    running.set(false)
    try {
      //Interrupt the reader thread
      fileChannel?.close()

    } catch (e: InterruptedException) {
      e.printStackTrace()
    }
  }

  private fun poll() {
    try {
      while (running.get()) {
        // read input event Data
        fileChannel?.read(inputEventData)

        // parse input event data
        inputEventData.order(ByteOrder.LITTLE_ENDIAN)
        val seconds: Number = if (is64Bit)
          inputEventData.getLong(secondsIndex) else inputEventData.getInt(secondsIndex)
        val microSeconds: Number = if (is64Bit)
          inputEventData.getLong(microSecondsIndex) else inputEventData.getInt(microSecondsIndex)
        val timestamp = "$seconds.$microSeconds"

        val type = inputEventData.getShort(typeIndex).toInt()
        val code = inputEventData.getShort(codeIndex).toInt()
        val value = inputEventData.getInt(valueIndex)

        //reset the position to zero
        inputEventData.flip()

        // distribute the event to listeners
        synchronized(listeners) {
          listeners.forEach { it.onEvent(InputEvent(timestamp, type, code, value)) }
        }
      }
    } catch (e: AsynchronousCloseException) {
      // FileChannel was closed by exit() function
      // Do nothing
      synchronized(listeners) {
        listeners.forEach { it.onExit() }
      }
    } catch (e: Exception) {
      synchronized(listeners) {
        listeners.forEach {
          it.onException(e)
          it.onExit()
        }
      }
    }
  }


  fun addListener(listener: KInputEventListener) {
    synchronized(listeners) {
      listeners.add(listener)
    }
  }

  fun removeListener(listener: KInputEventListener) {
    synchronized(listeners) {
      listeners.remove(listener)
    }
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