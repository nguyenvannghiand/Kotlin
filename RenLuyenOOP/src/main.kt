fun main() {
    var nv1 = NhanVien("Nguyen Van", "Anh", 620)
    var nv2 = NhanVien("Tran Minh", "Duc", 220)
    println("Thong tin cua nv1= ${nv1.Ho} - ${nv1.Ten}")
    println("Luong cua nv1 = ${nv1.getLuong()}")
    println("---------------")
    println("Thong tin cua nv2= ${nv2.Ho} - ${nv2.Ten}")
    println("Luong cua nv2 = ${nv2.getLuong()}")
    var s: String = if (nv1.LonHon(nv2)) "Luong nv1 lon hon nv2" else "Luong nhan vien 1 it hon nv2"
    println(s)
}