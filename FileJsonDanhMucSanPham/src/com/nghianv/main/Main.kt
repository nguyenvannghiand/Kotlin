package com.nghianv.main

import com.nghianv.io.JsonFileFactory
import com.nghianv.model.DanhMuc
import com.nghianv.model.SanPham

fun testLuuDanhMucVaSanPham() {
    var dsDanhMuc: MutableList<DanhMuc> = mutableListOf()
    var nuocNgot = DanhMuc(1, "Nuoc Ngot")
    nuocNgot.danhSachSanPham.add(SanPham(1, "Cocacola", 15.0))
    nuocNgot.danhSachSanPham.add(SanPham(2, "Pepsi", 16.0))
    nuocNgot.danhSachSanPham.add(SanPham(3, "String", 12.0))
    dsDanhMuc.add(nuocNgot)
    //
    var bia = DanhMuc(2, "Bia")
    bia.danhSachSanPham.add(SanPham(4, "Bia Ken", 35.0))
    bia.danhSachSanPham.add(SanPham(5, "Bia Ha Noi", 20.0))
    dsDanhMuc.add(bia)
    //
    var ruou = DanhMuc(3, "Ruou")
    ruou.danhSachSanPham.add(SanPham(6, "Ruou Voka Ha Noi", 70.0))
    ruou.danhSachSanPham.add(SanPham(7, "Ruou Uyki", 80.0))
    ruou.danhSachSanPham.add(SanPham(8, "Ruou Vang BoxDeu", 120.0))
    ruou.danhSachSanPham.add(SanPham(9, "Ruou Champe", 300.0))
    dsDanhMuc.add(ruou)
    //
    var jsonFileFactory = JsonFileFactory()
    var kq = jsonFileFactory.luuDuLieu(dsDanhMuc, "/home/nghianv/csdlSanPham.json")
    if (kq) {
        println("Luu json Danh muc san pham thanh cong")
    } else {
        println("Sorry, luu khong thanh cong")
    }

}

fun main() {
//    testLuuDanhMucVaSanPham()

    //Doc file
    var dsDanhMuc = JsonFileFactory().docDulieu("/home/nghianv/csdlSanPham.json")
    println(dsDanhMuc)
}