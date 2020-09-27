import java.text.SimpleDateFormat
import java.util.*

fun main() {
    var sdf = SimpleDateFormat("dd/MM/yyyy")
    println("Nhap ngay thang nam sinh (dd/MM/yyyy):")
    var namSinh = readLine()
    if (namSinh == null) return
    var date = sdf.parse(namSinh)
    var calendarCurrent = Calendar.getInstance()
    var yearCurrent = calendarCurrent.get(Calendar.YEAR)
    var calBirthday = Calendar.getInstance()
    calBirthday.time = date
    var yearBirthday = calBirthday.get(Calendar.YEAR)
    var age = yearCurrent - yearBirthday
    println("Tuoi cua ban: $age")


}