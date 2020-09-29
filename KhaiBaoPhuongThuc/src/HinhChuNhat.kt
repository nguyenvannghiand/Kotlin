class HinhChuNhat {
    private var chieuDai: Int = 0
    private var chieuRong: Int = 0

    //
    public fun chuVi(): Int {
        return (chieuDai + chieuRong) * 2
    }

    public fun dienTich(): Int {
        return chieuDai * chieuRong
    }
    public fun xuatThongTin() {
        println("Chieu dai = $chieuDai")
        println("Chieu rong = $chieuRong")
        println("Chu vi = ${chuVi()}")
        println("Dien tich = ${dienTich()}")

    }

    //
    public var ChieuDai: Int
        get() {
            return chieuDai
        }
        set(value) {
            chieuDai = value
        }
    public var ChieuRong: Int
        get() {
            return chieuRong
        }
        set(value) {
            chieuRong = value
        }

    override fun toString(): String {
        return "Dien tich = ${dienTich()}; Chu vi = ${chuVi()}"
    }

}