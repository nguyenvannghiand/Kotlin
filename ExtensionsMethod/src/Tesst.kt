import java.util.*

fun main() {
    var bb =BB()
    var calendar = Calendar.getInstance()
    calendar.set(Calendar.YEAR, 1991)
    calendar.set(Calendar.MONTH, 11)
    calendar.set(Calendar.DAY_OF_YEAR, 20)
    var sv: SinhVien = SinhVien(calendar.time)
    println("Tuoi cua sv: ${bb.Tuoi1()}")
}