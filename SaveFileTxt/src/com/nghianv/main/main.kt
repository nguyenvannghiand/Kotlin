package com.nghianv.main

import com.nghianv.io.TextFileFactory
import com.nghianv.model.NhanVien
import java.util.*

fun luuNhanVien() {
    var dsNV: MutableList<NhanVien> = mutableListOf()

    var cal = Calendar.getInstance()
    cal.set(Calendar.YEAR, 1990)
    cal.set(Calendar.MONTH, 11)
    cal.set(Calendar.DAY_OF_MONTH, 12)
    dsNV.add(NhanVien(1, "An", cal.time))
    //
    cal.set(Calendar.YEAR, 1992)
    cal.set(Calendar.MONTH, 10)
    cal.set(Calendar.DAY_OF_MONTH, 15)
    dsNV.add(NhanVien(2, "Binh", cal.time))
    //
    cal.set(Calendar.YEAR, 1995)
    cal.set(Calendar.MONTH, 5)
    cal.set(Calendar.DAY_OF_MONTH, 12)
    dsNV.add(NhanVien(3, "Phuong", cal.time))
    //
    var textFileFactory: TextFileFactory = TextFileFactory()
    var kq = textFileFactory.luuDuLieu(dsNV, "/home/nghianv/dulieuNhanVien.txt")
    if (kq) {
        println("Luu thanh cong")
    } else {
        println("Luu that bai")
    }

}

fun main() {
//    luuNhanVien()
    var textFileFactory= TextFileFactory()
    var dsNV: MutableList<NhanVien> = textFileFactory.docDuLieu("/home/nghianv/dulieuNhanVien.txt")
    for (nv in dsNV) {
        println(nv)
    }
}