enum class XepLoai {
    XuatSac("Xuất sắc"),
    Gioi("Giỏi"),
    Kha("Khá"),
    TrungBinh("Trung Bình"),
    Yeu("Yếu"),
    Kem("Kém"),
    NhapKhongDung("Nhập không đúng");

    private var descripton: String = ""
    constructor(s:String){
        descripton = s
    }
    public var Description: String
    get() {return descripton}
    set(value) {descripton =value}
}