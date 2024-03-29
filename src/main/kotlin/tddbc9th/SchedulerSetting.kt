package tddbc9th

class SchedulerSetting(val time: Time) {
    fun getString() = "${time.second} ${time.minute} ${time.hour}"
    fun isTimeMatch(opponentTime: Time) = time.isMatch(opponentTime)
}
