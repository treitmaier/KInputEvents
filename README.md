# KInputEvents
KInputEvents is a 100% Kotlin library to surface events from the [Linux Kernel Input Subsystem](https://www.kernel.org/doc/html/latest/input/input_kapi.html). It is therefore up to the user to decide if the **K** in **K**InputEvents should stand for **K**ernel or **K**otlin :). 

KInputEvents does not depend on any native libraries or applications and is compatible with both 32bit & 64bit CPU architectures (x86 & ARM).  This is the primary differentiating factor from similar libraries (e.g. [JInput](https://github.com/jinput/jinput), [JNativeHook](https://github.com/kwhat/jnativehook), & [evdev-java](https://github.com/progman32/evdev-java)), which use native libraries and can therefore be somewhat tricky to get running.

## Background

Input Events can come from a broad range of devices: from keyboards and mice to touchscreens, joysticks, and hardware buttons.  In fact, the motivation and first use case for KInputEvents was to respond to key-presses on a [3x4 Matrix Keypad](https://reitmaier.xyz/blog/matrix_keyboard/) connected to a Raspberry Pi's GPIOs.  

The Linux Kernel Input Subsystem creates device files for these diverse input devices in the `/dev/input` directory. KInputEvents binds to a specified input device (e.g. `/dev/input/mouse0`) and surfaces events to any listeners registered to it. For example, when the user moves the mouse, presses a key, or touches the screen, depending on the input device file.

## Sample

To get an impression of the functionality that KInputEvents provides, checkout the [Demo Application](src/main/kotlin/xyz/reitmaier/kinputevents/KInputEventsDemo.kt) which listens for and prints out keyboard key release events.  

Here's what it outputs when typing in the letters 'kinputevents' on a keyboard, in the case represented by the `/dev/input/event0` device file:

    Event: Time 1594904982.414985, type 1 (EV_KEY), code 37 (KEY_K), value 0 (EV_KEY_RELEASE)
    Event: Time 1594904983.374958, type 1 (EV_KEY), code 23 (KEY_I), value 0 (EV_KEY_RELEASE)
    Event: Time 1594904983.689980, type 1 (EV_KEY), code 49 (KEY_N), value 0 (EV_KEY_RELEASE)
    Event: Time 1594904983.998405, type 1 (EV_KEY), code 25 (KEY_P), value 0 (EV_KEY_RELEASE)
    Event: Time 1594904984.217986, type 1 (EV_KEY), code 22 (KEY_U), value 0 (EV_KEY_RELEASE)
    Event: Time 1594904984.523669, type 1 (EV_KEY), code 20 (KEY_T), value 0 (EV_KEY_RELEASE)
    Event: Time 1594904984.737344, type 1 (EV_KEY), code 18 (KEY_E), value 0 (EV_KEY_RELEASE)
    Event: Time 1594904985.213690, type 1 (EV_KEY), code 47 (KEY_V), value 0 (EV_KEY_RELEASE)
    Event: Time 1594904985.443570, type 1 (EV_KEY), code 18 (KEY_E), value 0 (EV_KEY_RELEASE)
    Event: Time 1594904985.601805, type 1 (EV_KEY), code 49 (KEY_N), value 0 (EV_KEY_RELEASE)
    Event: Time 1594904985.695199, type 1 (EV_KEY), code 20 (KEY_T), value 0 (EV_KEY_RELEASE)
    Event: Time 1594904985.921252, type 1 (EV_KEY), code 31 (KEY_S), value 0 (EV_KEY_RELEASE)
    
Since KInputEvents reads directly from the input device file, you'll need to be careful that the user running the application has read access permission to the specified `/dev/input/eventX` file.  On [Raspberry Pi OS & Raspbian](https://www.raspberrypi.org) & [ArchLinux](https://www.archlinux.org/) (and presumably other Linux distributions too), the easiest way to ensure that the user has the necessary permissions is to add the user to the 'input' group using the following command:

    sudo usermod -a -G input $USER

Remember that you'll need to logout and login again for the changes to take effect.

Next you'll need to be careful that you're listening to the correct input device.  The easiest way to check this is to use the `evtest` command. You may need to install the `evtest` package first. It should enumerate all `/dev/input/eventX` devices files along with some additional information to help with their identification.

## Roadmap

Currently KInputDevices has been successfully deployed on a 64bit Arch Linux OS (amd64) as well as 32bit (armv7l) & 64bit (aarch64) versions of Raspberry Pi OS.  These deployments have primarily focused on keypad & keyboard devices, which is why input events from these devices are presented in a more interpreted form ([see KeyCodes.kt](src/main/kotlin/xyz/reitmaier/kinputevents/KeyCodes.kt)).

The Linux Kernel source code has a [comprehensive list of input event codes](https://github.com/torvalds/linux/blob/master/include/uapi/linux/input-event-codes.h) and their meanings.  I used this documentation to interpret the keypresses in the sample application.  Input Events from other devices, such as mice and touch screens, are currently only presented in raw form.  Please feel free to submit issues or pull requests if you end up using (or wanting to use) KInputDevices for additional input devices.


