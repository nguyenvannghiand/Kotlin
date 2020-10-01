class SinhVien {
    private var ma: Int = 0
    private var ten: String = ""
    private var diem: Double = 0.0

    constructor(ma: Int, ten: String, diem: Double) {
        this.ma = ma
        this.ten = ten
        this.diem = diem
    }

    fun xepLoaiHocTap(): XepLoai {
        if (diem > 10.0 || diem < 0.0) return XepLoai.NhapKhongDung
        if (diem >= 9.0) return XepLoai.XuatSac
        if (diem >= 8.0) return XepLoai.Gioi
        if (diem >= 7.0) return XepLoai.Kha
        if (diem >= 5) return XepLoai.TrungBinh
        if (diem >= 3) return XepLoai.Yeu
        return XepLoai.Kem
    }

    override fun toString(): String {
        return "$ma - $ten, diem : $diem-> ${xepLoaiHocTap().Description}"
    }
}