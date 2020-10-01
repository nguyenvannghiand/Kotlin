class NhanVien {
    private var ho: String = ""
    private var ten: String = ""
    private var soSP: Int = 0

    //
    constructor(ho: String, ten: String, soSP: Int) {
        this.ho = ho
        this.ten = ten
        this.soSP = soSP
        if (soSP < 0) {
            this.soSP = 0
        }
    }

    public var Ho: String
        get() {
            return ho
        }
        set(value) {
            ho = value
        }
    public var Ten: String
        get() {
            return ten
        }
        set(value) {
            ten = value
        }
    public var SoSP: Int
        get() {
            return soSP
        }
        set(value) {
            soSP = value
        }
    public fun getLuong():Double{
        var donGia: Double = 0.0
        if (soSP <= 199) {
            donGia = 0.5
        }else if (soSP <= 399) {
            donGia = 0.55
        }else if (soSP <= 599) {
            donGia = 0.6
        }else{
            donGia = 0.65
        }
        return soSP * donGia
    }
    public fun LonHon(nv2: NhanVien):Boolean{
        return (this.soSP > nv2.soSP)
    }

}