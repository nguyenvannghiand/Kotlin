import java.util.*

fun Int.Cong(a: Int): Int {
    return this + a
}

fun Int.kiemTraNguyenTo(): Boolean {
    var dem = 0
    for (i in 1..this) {
        if (this % i == 0) {
            dem++
        }
    }
    return dem == 2
}

fun SinhVien.Tuoi(): Int {
    var calNow = Calendar.getInstance()
    var yearNow = calNow.get(Calendar.YEAR)
    calNow.time = this.namSinh
    var yearBirth = calNow.get(Calendar.YEAR)
    return yearNow - yearBirth
}

fun main() {
    var a = 5.Cong(9)
    println(a)
    if (7.kiemTraNguyenTo()) {
        println("7 la so nguyen to")
    }
    var x = 9
    if (x.kiemTraNguyenTo()) {
        println("$x la so nguyen to")
    } else {
        println("$x khong la so nguyen to")
    }
    var calendar = Calendar.getInstance()
    calendar.set(Calendar.YEAR, 1990)
    calendar.set(Calendar.MONTH, 11)
    calendar.set(Calendar.DAY_OF_YEAR, 20)
    var sv1 = SinhVien(calendar.time)
//    println("Tuoi cua sv1: ${sv1.Tuoi()}")

}