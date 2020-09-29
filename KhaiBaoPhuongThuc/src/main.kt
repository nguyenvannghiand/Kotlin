fun main() {
    var h1 = HinhChuNhat()
    h1.ChieuDai = 5
    h1.ChieuRong = 3
    h1.xuatThongTin()
    var dt = h1.dienTich()
    println("-------------")
    println("Dien tich = $dt m^2")
    var h2 = HinhChuNhat()
    h2.ChieuDai = 10
    h2.ChieuRong = 8
    println(h2)
    var tg1 = TamGiac(5, 8, 9)
    tg1.canhA = 6
    tg1.Ten = "Tam giac A "
    println(tg1)

}