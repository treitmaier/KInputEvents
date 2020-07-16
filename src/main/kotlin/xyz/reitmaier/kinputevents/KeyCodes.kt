package xyz.reitmaier.kinputevents

// Key Event Values
const val EV_KEY_RELEASE = 0x00
const val EV_KEY_PRESS = 0x01
const val EV_KEY_REPEAT = 0x02

val EV_KEY_VALUES = hashMapOf(
        EV_KEY_PRESS to ::EV_KEY_PRESS.name,
        EV_KEY_RELEASE to ::EV_KEY_RELEASE.name,
        EV_KEY_REPEAT to ::EV_KEY_REPEAT.name
)

// Keys & Button Codes
// See https://github.com/torvalds/linux/blob/master/include/uapi/linux/input-event-codes.h
const val KEY_RESERVED = 0
const val KEY_ESC = 1
const val KEY_1 = 2
const val KEY_2 = 3
const val KEY_3 = 4
const val KEY_4 = 5
const val KEY_5 = 6
const val KEY_6 = 7
const val KEY_7 = 8
const val KEY_8 = 9
const val KEY_9 = 10
const val KEY_0 = 11
const val KEY_MINUS = 12
const val KEY_EQUAL = 13
const val KEY_BACKSPACE = 14
const val KEY_TAB = 15
const val KEY_Q = 16
const val KEY_W = 17
const val KEY_E = 18
const val KEY_R = 19
const val KEY_T = 20
const val KEY_Y = 21
const val KEY_U = 22
const val KEY_I = 23
const val KEY_O = 24
const val KEY_P = 25
const val KEY_LEFTBRACE = 26
const val KEY_RIGHTBRACE = 27
const val KEY_ENTER = 28
const val KEY_LEFTCTRL = 29
const val KEY_A = 30
const val KEY_S = 31
const val KEY_D = 32
const val KEY_F = 33
const val KEY_G = 34
const val KEY_H = 35
const val KEY_J = 36
const val KEY_K = 37
const val KEY_L = 38
const val KEY_SEMICOLON = 39
const val KEY_APOSTROPHE = 40
const val KEY_GRAVE = 41
const val KEY_LEFTSHIFT = 42
const val KEY_BACKSLASH = 43
const val KEY_Z = 44
const val KEY_X = 45
const val KEY_C = 46
const val KEY_V = 47
const val KEY_B = 48
const val KEY_N = 49
const val KEY_M = 50
const val KEY_COMMA = 51
const val KEY_DOT = 52
const val KEY_SLASH = 53
const val KEY_RIGHTSHIFT = 54
const val KEY_KPASTERISK = 55
const val KEY_LEFTALT = 56
const val KEY_SPACE = 57
const val KEY_CAPSLOCK = 58
const val KEY_F1 = 59
const val KEY_F2 = 60
const val KEY_F3 = 61
const val KEY_F4 = 62
const val KEY_F5 = 63
const val KEY_F6 = 64
const val KEY_F7 = 65
const val KEY_F8 = 66
const val KEY_F9 = 67
const val KEY_F10 = 68
const val KEY_NUMLOCK = 69
const val KEY_SCROLLLOCK = 70
const val KEY_KP7 = 71
const val KEY_KP8 = 72
const val KEY_KP9 = 73
const val KEY_KPMINUS = 74
const val KEY_KP4 = 75
const val KEY_KP5 = 76
const val KEY_KP6 = 77
const val KEY_KPPLUS = 78
const val KEY_KP1 = 79
const val KEY_KP2 = 80
const val KEY_KP3 = 81
const val KEY_KP0 = 82
const val KEY_KPDOT = 83

const val KEY_ZENKAKUHANKAKU = 85
const val KEY_102ND = 86
const val KEY_F11 = 87
const val KEY_F12 = 88
const val KEY_RO = 89
const val KEY_KATAKANA = 90
const val KEY_HIRAGANA = 91
const val KEY_HENKAN = 92
const val KEY_KATAKANAHIRAGANA = 93
const val KEY_MUHENKAN = 94
const val KEY_KPJPCOMMA = 95
const val KEY_KPENTER = 96
const val KEY_RIGHTCTRL = 97
const val KEY_KPSLASH = 98
const val KEY_SYSRQ = 99
const val KEY_RIGHTALT = 100
const val KEY_LINEFEED = 101
const val KEY_HOME = 102
const val KEY_UP = 103
const val KEY_PAGEUP = 104
const val KEY_LEFT = 105
const val KEY_RIGHT = 106
const val KEY_END = 107
const val KEY_DOWN = 108
const val KEY_PAGEDOWN = 109
const val KEY_INSERT = 110
const val KEY_DELETE = 111
const val KEY_MACRO = 112
const val KEY_MUTE = 113
const val KEY_VOLUMEDOWN = 114
const val KEY_VOLUMEUP = 115
const val KEY_POWER = 116	/* SC System Power Down */
const val KEY_KPEQUAL = 117
const val KEY_KPPLUSMINUS = 118
const val KEY_PAUSE = 119
const val KEY_SCALE = 120	/* AL Compiz Scale (Expose) */

const val KEY_KPCOMMA = 121
const val KEY_HANGEUL = 122
const val KEY_HANGUEL = KEY_HANGEUL
const val KEY_HANJA = 123
const val KEY_YEN = 124
const val KEY_LEFTMETA = 125
const val KEY_RIGHTMETA = 126
const val KEY_COMPOSE = 127

const val KEY_STOP = 128	/* AC Stop */
const val KEY_AGAIN = 129
const val KEY_PROPS = 130	/* AC Properties */
const val KEY_UNDO = 131	/* AC Undo */
const val KEY_FRONT = 132
const val KEY_COPY = 133	/* AC Copy */
const val KEY_OPEN = 134	/* AC Open */
const val KEY_PASTE = 135	/* AC Paste */
const val KEY_FIND = 136	/* AC Search */
const val KEY_CUT = 137	/* AC Cut */
const val KEY_HELP = 138	/* AL Integrated Help Center */
const val KEY_MENU = 139	/* Menu (show menu) */
const val KEY_CALC = 140	/* AL Calculator */
const val KEY_SETUP = 141
const val KEY_SLEEP = 142	/* SC System Sleep */
const val KEY_WAKEUP = 143	/* System Wake Up */
const val KEY_FILE = 144	/* AL Local Machine Browser */
const val KEY_SENDFILE = 145
const val KEY_DELETEFILE = 146
const val KEY_XFER = 147
const val KEY_PROG1 = 148
const val KEY_PROG2 = 149
const val KEY_WWW = 150	/* AL Internet Browser */
const val KEY_MSDOS = 151
const val KEY_COFFEE = 152	/* AL Terminal Lock/Screensaver */
const val KEY_SCREENLOCK = KEY_COFFEE
const val KEY_ROTATE_DISPLAY = 153	/* Display orientation for e.g. tablets */
const val KEY_DIRECTION = KEY_ROTATE_DISPLAY
const val KEY_CYCLEWINDOWS = 154
const val KEY_MAIL = 155
const val KEY_BOOKMARKS = 156	/* AC Bookmarks */
const val KEY_COMPUTER = 157
const val KEY_BACK = 158	/* AC Back */
const val KEY_FORWARD = 159	/* AC Forward */
const val KEY_CLOSECD = 160
const val KEY_EJECTCD = 161
const val KEY_EJECTCLOSECD = 162
const val KEY_NEXTSONG = 163
const val KEY_PLAYPAUSE = 164
const val KEY_PREVIOUSSONG = 165
const val KEY_STOPCD = 166
const val KEY_RECORD = 167
const val KEY_REWIND = 168
const val KEY_PHONE = 169	/* Media Select Telephone */
const val KEY_ISO = 170
const val KEY_CONFIG = 171	/* AL Consumer Control Configuration */
const val KEY_HOMEPAGE = 172	/* AC Home */
const val KEY_REFRESH = 173	/* AC Refresh */
const val KEY_EXIT = 174	/* AC Exit */
const val KEY_MOVE = 175
const val KEY_EDIT = 176
const val KEY_SCROLLUP = 177
const val KEY_SCROLLDOWN = 178
const val KEY_KPLEFTPAREN = 179
const val KEY_KPRIGHTPAREN = 180
const val KEY_NEW = 181	/* AC New */
const val KEY_REDO = 182	/* AC Redo/Repeat */

const val KEY_F13 = 183
const val KEY_F14 = 184
const val KEY_F15 = 185
const val KEY_F16 = 186
const val KEY_F17 = 187
const val KEY_F18 = 188
const val KEY_F19 = 189
const val KEY_F20 = 190
const val KEY_F21 = 191
const val KEY_F22 = 192
const val KEY_F23 = 193
const val KEY_F24 = 194

const val KEY_PLAYCD = 200
const val KEY_PAUSECD = 201
const val KEY_PROG3 = 202
const val KEY_PROG4 = 203
const val KEY_DASHBOARD = 204	/* AL Dashboard */
const val KEY_SUSPEND = 205
const val KEY_CLOSE = 206	/* AC Close */
const val KEY_PLAY = 207
const val KEY_FASTFORWARD = 208
const val KEY_BASSBOOST = 209
const val KEY_PRINT = 210	/* AC Print */
const val KEY_HP = 211
const val KEY_CAMERA = 212
const val KEY_SOUND = 213
const val KEY_QUESTION = 214
const val KEY_EMAIL = 215
const val KEY_CHAT = 216
const val KEY_SEARCH = 217
const val KEY_CONNECT = 218
const val KEY_FINANCE = 219	/* AL Checkbook/Finance */
const val KEY_SPORT = 220
const val KEY_SHOP = 221
const val KEY_ALTERASE = 222
const val KEY_CANCEL = 223	/* AC Cancel */
const val KEY_BRIGHTNESSDOWN = 224
const val KEY_BRIGHTNESSUP = 225
const val KEY_MEDIA = 226

const val KEY_SWITCHVIDEOMODE = 227	/* Cycle between available video outputs = (Monitor/LCD/TV-out/etc) */
const val KEY_KBDILLUMTOGGLE = 228
const val KEY_KBDILLUMDOWN = 229
const val KEY_KBDILLUMUP = 230

const val KEY_SEND = 231	/* AC Send */
const val KEY_REPLY = 232	/* AC Reply */
const val KEY_FORWARDMAIL = 233	/* AC Forward Msg */
const val KEY_SAVE = 234	/* AC Save */
const val KEY_DOCUMENTS = 235

const val KEY_BATTERY = 236

const val KEY_BLUETOOTH = 237
const val KEY_WLAN = 238
const val KEY_UWB = 239

const val KEY_UNKNOWN = 240

const val KEY_VIDEO_NEXT = 241	/* drive next video source */
const val KEY_VIDEO_PREV = 242	/* drive previous video source */
const val KEY_BRIGHTNESS_CYCLE = 243	/* brightness up, after max is min */
const val KEY_BRIGHTNESS_AUTO = 244	/* Set Auto Brightness: manual brightness control is off, rely on ambient */

const val KEY_BRIGHTNESS_ZERO = KEY_BRIGHTNESS_AUTO
const val KEY_DISPLAY_OFF = 245	/* display device to off state */

const val KEY_WWAN = 246	/* Wireless WAN (LTE, UMTS, GSM, etc.) */
const val KEY_WIMAX = KEY_WWAN
const val KEY_RFKILL = 247	/* Key that controls all radios */

const val KEY_MICMUTE = 248	/* Mute / unmute the microphone */
val KEYCODES = hashMapOf(
        KEY_RESERVED to ::KEY_RESERVED.name,
        KEY_ESC to ::KEY_ESC.name,
        KEY_1 to ::KEY_1.name,
        KEY_2 to ::KEY_2.name,
        KEY_3 to ::KEY_3.name,
        KEY_4 to ::KEY_4.name,
        KEY_5 to ::KEY_5.name,
        KEY_6 to ::KEY_6.name,
        KEY_7 to ::KEY_7.name,
        KEY_8 to ::KEY_8.name,
        KEY_9 to ::KEY_9.name,
        KEY_0 to ::KEY_0.name,
        KEY_MINUS to ::KEY_MINUS.name,
        KEY_EQUAL to ::KEY_EQUAL.name,
        KEY_BACKSPACE to ::KEY_BACKSPACE.name,
        KEY_TAB to ::KEY_TAB.name,
        KEY_Q to ::KEY_Q.name,
        KEY_W to ::KEY_W.name,
        KEY_E to ::KEY_E.name,
        KEY_R to ::KEY_R.name,
        KEY_T to ::KEY_T.name,
        KEY_Y to ::KEY_Y.name,
        KEY_U to ::KEY_U.name,
        KEY_I to ::KEY_I.name,
        KEY_O to ::KEY_O.name,
        KEY_P to ::KEY_P.name,
        KEY_LEFTBRACE to ::KEY_LEFTBRACE.name,
        KEY_RIGHTBRACE to ::KEY_RIGHTBRACE.name,
        KEY_ENTER to ::KEY_ENTER.name,
        KEY_LEFTCTRL to ::KEY_LEFTCTRL.name,
        KEY_A to ::KEY_A.name,
        KEY_S to ::KEY_S.name,
        KEY_D to ::KEY_D.name,
        KEY_F to ::KEY_F.name,
        KEY_G to ::KEY_G.name,
        KEY_H to ::KEY_H.name,
        KEY_J to ::KEY_J.name,
        KEY_K to ::KEY_K.name,
        KEY_L to ::KEY_L.name,
        KEY_SEMICOLON to ::KEY_SEMICOLON.name,
        KEY_APOSTROPHE to ::KEY_APOSTROPHE.name,
        KEY_GRAVE to ::KEY_GRAVE.name,
        KEY_LEFTSHIFT to ::KEY_LEFTSHIFT.name,
        KEY_BACKSLASH to ::KEY_BACKSLASH.name,
        KEY_Z to ::KEY_Z.name,
        KEY_X to ::KEY_X.name,
        KEY_C to ::KEY_C.name,
        KEY_V to ::KEY_V.name,
        KEY_B to ::KEY_B.name,
        KEY_N to ::KEY_N.name,
        KEY_M to ::KEY_M.name,
        KEY_COMMA to ::KEY_COMMA.name,
        KEY_DOT to ::KEY_DOT.name,
        KEY_SLASH to ::KEY_SLASH.name,
        KEY_RIGHTSHIFT to ::KEY_RIGHTSHIFT.name,
        KEY_KPASTERISK to ::KEY_KPASTERISK.name,
        KEY_LEFTALT to ::KEY_LEFTALT.name,
        KEY_SPACE to ::KEY_SPACE.name,
        KEY_CAPSLOCK to ::KEY_CAPSLOCK.name,
        KEY_F1 to ::KEY_F1.name,
        KEY_F2 to ::KEY_F2.name,
        KEY_F3 to ::KEY_F3.name,
        KEY_F4 to ::KEY_F4.name,
        KEY_F5 to ::KEY_F5.name,
        KEY_F6 to ::KEY_F6.name,
        KEY_F7 to ::KEY_F7.name,
        KEY_F8 to ::KEY_F8.name,
        KEY_F9 to ::KEY_F9.name,
        KEY_F10 to ::KEY_F10.name,
        KEY_NUMLOCK to ::KEY_NUMLOCK.name,
        KEY_SCROLLLOCK to ::KEY_SCROLLLOCK.name,
        KEY_KP7 to ::KEY_KP7.name,
        KEY_KP8 to ::KEY_KP8.name,
        KEY_KP9 to ::KEY_KP9.name,
        KEY_KPMINUS to ::KEY_KPMINUS.name,
        KEY_KP4 to ::KEY_KP4.name,
        KEY_KP5 to ::KEY_KP5.name,
        KEY_KP6 to ::KEY_KP6.name,
        KEY_KPPLUS to ::KEY_KPPLUS.name,
        KEY_KP1 to ::KEY_KP1.name,
        KEY_KP2 to ::KEY_KP2.name,
        KEY_KP3 to ::KEY_KP3.name,
        KEY_KP0 to ::KEY_KP0.name,
        KEY_KPDOT to ::KEY_KPDOT.name,
        KEY_ZENKAKUHANKAKU to ::KEY_ZENKAKUHANKAKU.name,
        KEY_102ND to ::KEY_102ND.name,
        KEY_F11 to ::KEY_F11.name,
        KEY_F12 to ::KEY_F12.name,
        KEY_RO to ::KEY_RO.name,
        KEY_KATAKANA to ::KEY_KATAKANA.name,
        KEY_HIRAGANA to ::KEY_HIRAGANA.name,
        KEY_HENKAN to ::KEY_HENKAN.name,
        KEY_KATAKANAHIRAGANA to ::KEY_KATAKANAHIRAGANA.name,
        KEY_MUHENKAN to ::KEY_MUHENKAN.name,
        KEY_KPJPCOMMA to ::KEY_KPJPCOMMA.name,
        KEY_KPENTER to ::KEY_KPENTER.name,
        KEY_RIGHTCTRL to ::KEY_RIGHTCTRL.name,
        KEY_KPSLASH to ::KEY_KPSLASH.name,
        KEY_SYSRQ to ::KEY_SYSRQ.name,
        KEY_RIGHTALT to ::KEY_RIGHTALT.name,
        KEY_LINEFEED to ::KEY_LINEFEED.name,
        KEY_HOME to ::KEY_HOME.name,
        KEY_UP to ::KEY_UP.name,
        KEY_PAGEUP to ::KEY_PAGEUP.name,
        KEY_LEFT to ::KEY_LEFT.name,
        KEY_RIGHT to ::KEY_RIGHT.name,
        KEY_END to ::KEY_END.name,
        KEY_DOWN to ::KEY_DOWN.name,
        KEY_PAGEDOWN to ::KEY_PAGEDOWN.name,
        KEY_INSERT to ::KEY_INSERT.name,
        KEY_DELETE to ::KEY_DELETE.name,
        KEY_MACRO to ::KEY_MACRO.name,
        KEY_MUTE to ::KEY_MUTE.name,
        KEY_VOLUMEDOWN to ::KEY_VOLUMEDOWN.name,
        KEY_VOLUMEUP to ::KEY_VOLUMEUP.name,
        KEY_POWER to ::KEY_POWER.name,
        KEY_KPEQUAL to ::KEY_KPEQUAL.name,
        KEY_KPPLUSMINUS to ::KEY_KPPLUSMINUS.name,
        KEY_PAUSE to ::KEY_PAUSE.name,
        KEY_SCALE to ::KEY_SCALE.name,
        KEY_KPCOMMA to ::KEY_KPCOMMA.name,
        KEY_HANGEUL to ::KEY_HANGEUL.name,
        KEY_HANGUEL to ::KEY_HANGUEL.name,
        KEY_HANJA to ::KEY_HANJA.name,
        KEY_YEN to ::KEY_YEN.name,
        KEY_LEFTMETA to ::KEY_LEFTMETA.name,
        KEY_RIGHTMETA to ::KEY_RIGHTMETA.name,
        KEY_COMPOSE to ::KEY_COMPOSE.name,
        KEY_STOP to ::KEY_STOP.name,
        KEY_AGAIN to ::KEY_AGAIN.name,
        KEY_PROPS to ::KEY_PROPS.name,
        KEY_UNDO to ::KEY_UNDO.name,
        KEY_FRONT to ::KEY_FRONT.name,
        KEY_COPY to ::KEY_COPY.name,
        KEY_OPEN to ::KEY_OPEN.name,
        KEY_PASTE to ::KEY_PASTE.name,
        KEY_FIND to ::KEY_FIND.name,
        KEY_CUT to ::KEY_CUT.name,
        KEY_HELP to ::KEY_HELP.name,
        KEY_MENU to ::KEY_MENU.name,
        KEY_CALC to ::KEY_CALC.name,
        KEY_SETUP to ::KEY_SETUP.name,
        KEY_SLEEP to ::KEY_SLEEP.name,
        KEY_WAKEUP to ::KEY_WAKEUP.name,
        KEY_FILE to ::KEY_FILE.name,
        KEY_SENDFILE to ::KEY_SENDFILE.name,
        KEY_DELETEFILE to ::KEY_DELETEFILE.name,
        KEY_XFER to ::KEY_XFER.name,
        KEY_PROG1 to ::KEY_PROG1.name,
        KEY_PROG2 to ::KEY_PROG2.name,
        KEY_WWW to ::KEY_WWW.name,
        KEY_MSDOS to ::KEY_MSDOS.name,
        KEY_COFFEE to ::KEY_COFFEE.name,
        KEY_SCREENLOCK to ::KEY_SCREENLOCK.name,
        KEY_ROTATE_DISPLAY to ::KEY_ROTATE_DISPLAY.name,
        KEY_DIRECTION to ::KEY_DIRECTION.name,
        KEY_CYCLEWINDOWS to ::KEY_CYCLEWINDOWS.name,
        KEY_MAIL to ::KEY_MAIL.name,
        KEY_BOOKMARKS to ::KEY_BOOKMARKS.name,
        KEY_COMPUTER to ::KEY_COMPUTER.name,
        KEY_BACK to ::KEY_BACK.name,
        KEY_FORWARD to ::KEY_FORWARD.name,
        KEY_CLOSECD to ::KEY_CLOSECD.name,
        KEY_EJECTCD to ::KEY_EJECTCD.name,
        KEY_EJECTCLOSECD to ::KEY_EJECTCLOSECD.name,
        KEY_NEXTSONG to ::KEY_NEXTSONG.name,
        KEY_PLAYPAUSE to ::KEY_PLAYPAUSE.name,
        KEY_PREVIOUSSONG to ::KEY_PREVIOUSSONG.name,
        KEY_STOPCD to ::KEY_STOPCD.name,
        KEY_RECORD to ::KEY_RECORD.name,
        KEY_REWIND to ::KEY_REWIND.name,
        KEY_PHONE to ::KEY_PHONE.name,
        KEY_ISO to ::KEY_ISO.name,
        KEY_CONFIG to ::KEY_CONFIG.name,
        KEY_HOMEPAGE to ::KEY_HOMEPAGE.name,
        KEY_REFRESH to ::KEY_REFRESH.name,
        KEY_EXIT to ::KEY_EXIT.name,
        KEY_MOVE to ::KEY_MOVE.name,
        KEY_EDIT to ::KEY_EDIT.name,
        KEY_SCROLLUP to ::KEY_SCROLLUP.name,
        KEY_SCROLLDOWN to ::KEY_SCROLLDOWN.name,
        KEY_KPLEFTPAREN to ::KEY_KPLEFTPAREN.name,
        KEY_KPRIGHTPAREN to ::KEY_KPRIGHTPAREN.name,
        KEY_NEW to ::KEY_NEW.name,
        KEY_REDO to ::KEY_REDO.name,
        KEY_F13 to ::KEY_F13.name,
        KEY_F14 to ::KEY_F14.name,
        KEY_F15 to ::KEY_F15.name,
        KEY_F16 to ::KEY_F16.name,
        KEY_F17 to ::KEY_F17.name,
        KEY_F18 to ::KEY_F18.name,
        KEY_F19 to ::KEY_F19.name,
        KEY_F20 to ::KEY_F20.name,
        KEY_F21 to ::KEY_F21.name,
        KEY_F22 to ::KEY_F22.name,
        KEY_F23 to ::KEY_F23.name,
        KEY_F24 to ::KEY_F24.name,
        KEY_PLAYCD to ::KEY_PLAYCD.name,
        KEY_PAUSECD to ::KEY_PAUSECD.name,
        KEY_PROG3 to ::KEY_PROG3.name,
        KEY_PROG4 to ::KEY_PROG4.name,
        KEY_DASHBOARD to ::KEY_DASHBOARD.name,
        KEY_SUSPEND to ::KEY_SUSPEND.name,
        KEY_CLOSE to ::KEY_CLOSE.name,
        KEY_PLAY to ::KEY_PLAY.name,
        KEY_FASTFORWARD to ::KEY_FASTFORWARD.name,
        KEY_BASSBOOST to ::KEY_BASSBOOST.name,
        KEY_PRINT to ::KEY_PRINT.name,
        KEY_HP to ::KEY_HP.name,
        KEY_CAMERA to ::KEY_CAMERA.name,
        KEY_SOUND to ::KEY_SOUND.name,
        KEY_QUESTION to ::KEY_QUESTION.name,
        KEY_EMAIL to ::KEY_EMAIL.name,
        KEY_CHAT to ::KEY_CHAT.name,
        KEY_SEARCH to ::KEY_SEARCH.name,
        KEY_CONNECT to ::KEY_CONNECT.name,
        KEY_FINANCE to ::KEY_FINANCE.name,
        KEY_SPORT to ::KEY_SPORT.name,
        KEY_SHOP to ::KEY_SHOP.name,
        KEY_ALTERASE to ::KEY_ALTERASE.name,
        KEY_CANCEL to ::KEY_CANCEL.name,
        KEY_BRIGHTNESSDOWN to ::KEY_BRIGHTNESSDOWN.name,
        KEY_BRIGHTNESSUP to ::KEY_BRIGHTNESSUP.name,
        KEY_MEDIA to ::KEY_MEDIA.name,
        KEY_SWITCHVIDEOMODE to ::KEY_SWITCHVIDEOMODE.name,
        KEY_KBDILLUMTOGGLE to ::KEY_KBDILLUMTOGGLE.name,
        KEY_KBDILLUMDOWN to ::KEY_KBDILLUMDOWN.name,
        KEY_KBDILLUMUP to ::KEY_KBDILLUMUP.name,
        KEY_SEND to ::KEY_SEND.name,
        KEY_REPLY to ::KEY_REPLY.name,
        KEY_FORWARDMAIL to ::KEY_FORWARDMAIL.name,
        KEY_SAVE to ::KEY_SAVE.name,
        KEY_DOCUMENTS to ::KEY_DOCUMENTS.name,
        KEY_BATTERY to ::KEY_BATTERY.name,
        KEY_BLUETOOTH to ::KEY_BLUETOOTH.name,
        KEY_WLAN to ::KEY_WLAN.name,
        KEY_UWB to ::KEY_UWB.name,
        KEY_UNKNOWN to ::KEY_UNKNOWN.name,
        KEY_VIDEO_NEXT to ::KEY_VIDEO_NEXT.name,
        KEY_VIDEO_PREV to ::KEY_VIDEO_PREV.name,
        KEY_BRIGHTNESS_CYCLE to ::KEY_BRIGHTNESS_CYCLE.name,
        KEY_BRIGHTNESS_AUTO to ::KEY_BRIGHTNESS_AUTO.name,
        KEY_BRIGHTNESS_ZERO to ::KEY_BRIGHTNESS_ZERO.name,
        KEY_DISPLAY_OFF to ::KEY_DISPLAY_OFF.name,
        KEY_WWAN to ::KEY_WWAN.name,
        KEY_WIMAX to ::KEY_WIMAX.name,
        KEY_RFKILL to ::KEY_RFKILL.name,
        KEY_MICMUTE to ::KEY_MICMUTE.name
)
