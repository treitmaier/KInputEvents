package xyz.reitmaier.kinputevents

// Event Types
const val EV_SYN = 0x00
const val EV_KEY = 0x01
const val EV_REL = 0x02
const val EV_ABS = 0x03
const val EV_MSC = 0x04
const val EV_SW = 0x05
const val EV_LED = 0x11
const val EV_SND = 0x12
const val EV_REP = 0x14
const val EV_FF = 0x15
const val EV_PWR = 0x16
const val EV_FF_STATUS = 0x17
const val EV_MAX = 0x1f
const val EV_CNT = 0x20

// Event Types as HashMap
val EVENT_TYPES = hashMapOf(
        EV_SYN to ::EV_SYN.name,
        EV_KEY to ::EV_KEY.name,
        EV_REL to ::EV_REL.name,
        EV_ABS to ::EV_ABS.name,
        EV_MSC to ::EV_MSC.name,
        EV_SW to ::EV_SW.name,
        EV_LED to ::EV_LED.name,
        EV_SND to ::EV_SND.name,
        EV_REP to ::EV_REP.name,
        EV_FF to ::EV_FF.name,
        EV_PWR to ::EV_PWR.name,
        EV_FF_STATUS to ::EV_FF_STATUS.name,
        EV_MAX to ::EV_MAX.name,
        EV_CNT to ::EV_CNT.name
)
