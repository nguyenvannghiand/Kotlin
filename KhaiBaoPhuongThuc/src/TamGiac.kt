data class TamGiac(var canhA: Int, var canhB: Int, var canhC: Int) {
    private var ten: String = ""

    fun chuVi(): Int {
        return canhA + canhB + canhC
    }
    fun dienTich(): Double {
        var p = chuVi()/2
        return Math.sqrt(p * 1.0 * (p - canhA) * (p - canhB) * (p - canhC))
    }

    //
    var Ten:String
    get() {return ten}
    set(value) {ten = value}
    //
    override fun toString(): String {
        return "${Ten} co Chu vi = ${chuVi()}; Dien tich = ${dienTich()}"
    }
}
