package xyz.reitmaier.kinputevents

import java.util.concurrent.atomic.AtomicBoolean

fun main() {
    // Initialise with keyboard device
    // The input device path on your system, will likely be different (see below)
    val keyboard = KInputEvents("/dev/input/event0")
    /*
     to list input devices run
     evtest

     Also ensure current user has permission to access input device.
     On PiOS/Raspbian the easiest way is to add $USER to input group:
     sudo usermod -a -G input $USER

     ... and log out and login again.
     */

    var lastKeyPressed = -1
    val running = AtomicBoolean(true)
    // Add Input Event Listener
    val keyEventListener: OnInputEventListener = {
        // Only listen for key releases and print them out
        if(it.type == EV_KEY && it.value == EV_KEY_RELEASE) {
            println(it)
            if(lastKeyPressed == it.code) {
                running.set(false)
                println("Exiting")
            } else {
                lastKeyPressed = it.code
            }
        }
    }
    keyboard.addListener(keyEventListener)

    // Start listening for input events
    keyboard.start()

    println("Press any key twice to exit...")

    //Exit when same key is pressed twice
    while(running.get()) {
        Thread.sleep(200)
    }
    keyboard.removeListener(keyEventListener)
    keyboard.exit()
}
