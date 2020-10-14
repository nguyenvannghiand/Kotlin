package com.nghianv.main

import com.nghianv.io.XMLFileFactory
import com.nghianv.model.SanPham

fun testLuuXML() {
    var path: String = "/home/nghianv/dulieuXML.xml"
    var dsSP: MutableList<SanPham> = mutableListOf()
    dsSP.add(SanPham(1, "Coca", 15.5))
    dsSP.add(SanPham(2, "Pepsi", 16.0))
    dsSP.add(SanPham(3, "String", 16.5))
    dsSP.add(SanPham(4, "Redbull", 12.5))
    dsSP.add(SanPham(5, "Aquafina", 10.0))

    var xlmFF = XMLFileFactory()
    var kq = xlmFF.luuDuLieu(dsSP, path)
    if (kq) {
        println("Luu XML thanh cong")
    }else{
        println("Sorry, Luu XML that bai!")
    }
}


fun main() {
//    testLuuXML()

    //Doc du lieu tu file
    var path: String = "/home/nghianv/dulieuXML.xml"
    var xlmFF = XMLFileFactory()
    var dsSP = xlmFF.docDuLieu(path)
    for (sp in dsSP) {
        println(sp)
    }
}