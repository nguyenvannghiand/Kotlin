import java.util.*

class BB {
    var innn:Int= 13445666

    fun SinhVien.Tuoi(): Int {
        var calNow = Calendar.getInstance()
        var yearNow = calNow.get(Calendar.YEAR)
        calNow.time = this.namSinh
        var yearBirth = calNow.get(Calendar.YEAR)
        return innn
    }
}