package xyz.reitmaier.kinputevents

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

    // Add Input Event Listener
    val keyEventListener: OnInputEventListener = {
        // Only listen for KEY presses and print them out
        if(it.type == EV_KEY)
            println(it)
    }
    keyboard.addListener(keyEventListener)

    // Start listening for input events
    keyboard.start()

    //Exit after 10 seconds
    Thread.sleep(10_000L)
    keyboard.removeListener(keyEventListener)
    keyboard.exit()
}

