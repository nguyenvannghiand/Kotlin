import java.text.SimpleDateFormat
import java.time.Year
import java.util.*

fun main() {
    var calendar: Calendar = Calendar.getInstance()
    var year = calendar.get(Calendar.YEAR)
    var month = calendar.get(Calendar.MONTH)
    var day = calendar.get(Calendar.DAY_OF_MONTH)
    println("$day/${month+1}/$year")
    println("-------------")
    calendar.set(Calendar.YEAR, 2019)
    year = calendar.get(Calendar.YEAR)
    println("$year")
    var time = calendar.time
    var sdf1 = SimpleDateFormat("dd/MM/yyyy")
    println(sdf1.format(time))
    var sdf2 = SimpleDateFormat("dd/MM/yyyy HH:mm:ss aaa")
    println(sdf2.format(time))


}