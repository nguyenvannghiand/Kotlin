package com.nghianv.main

import com.nghianv.io.JsonFileFactory
import com.nghianv.model.DanhMuc
import com.nghianv.model.SanPham

fun testLuuDanhMucVaSanPham(){
    var path: String = "/home/nghianv/csdlSanPhamDaLuu.json"!!
    var dsDanhMuc: MutableList<DanhMuc> = mutableListOf()
    //
    var nuocNgot = DanhMuc(1, "Nuoc Ngot")
    nuocNgot.dsSanPham.add(SanPham(1, "CocaCola", 15.0))
    nuocNgot.dsSanPham.add(SanPham(2, "Pepsi", 14.0))
    nuocNgot.dsSanPham.add(SanPham(3, "Fanta", 10.0))
    nuocNgot.dsSanPham.add(SanPham(4, "String", 12.0))
    dsDanhMuc.add(nuocNgot)
    //
    var bia = DanhMuc(2, "Bia")
    bia.dsSanPham.add(SanPham(5,"Bia Ken", 30.0))
    bia.dsSanPham.add(SanPham(6,"Bia Tiger", 20.0))
    bia.dsSanPham.add(SanPham(7,"Bia Ha Noi", 18.0))
    dsDanhMuc.add(bia)
    //
    var ruou = DanhMuc(3, "Ruou")
    ruou.dsSanPham.add(SanPham(8, "Ruou Voka", 70.0))
    ruou.dsSanPham.add(SanPham(9, "Ruou Uytki", 120.0))
    ruou.dsSanPham.add(SanPham(10, "Ruou Vang Boxdeu", 250.0))
    ruou.dsSanPham.add(SanPham(11, "Ruou Champe", 70.0))
    dsDanhMuc.add(ruou)
    //
    var jsonFileFactory = JsonFileFactory()
    var kq = jsonFileFactory.luuDuLieu(dsDanhMuc, path)
    var string = if (kq) "Luu Json Danh muc san pham thanh cong" else "Sorry, Da xay ra loi!"
    println(string)
}
fun main() {
//    testLuuDanhMucVaSanPham()

    //Doc file du lieu
    var path: String = "/home/nghianv/csdlSanPhamDaLuu.json"!!
    var dsDanhMuc = JsonFileFactory().docDuLieu(path)
    println(dsDanhMuc)
}