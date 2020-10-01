package com.nghianv.main

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.nghianv.model.SanPham
import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun luuMotDoiTuong() {
    try {
        var sp = SanPham(1,"Coca Cola", 15.0)
        var gson =Gson()
        var file = FileWriter("/home/nghianv/doituongsanpham.json")
        gson.toJson(sp,file)
        file.close()
        println("Xuat Json thanh cong")
    } catch (ex: Exception) {
        ex.printStackTrace()
    }
}
fun luuNhieuDoiTuong(){
    try {
        var dsSP:MutableList<SanPham> = mutableListOf()
        dsSP.add(SanPham(1, "Coca Cola", 15.0))
        dsSP.add(SanPham(2, "Pesi", 15.0))
        dsSP.add(SanPham(3, "Beer", 12.0))
        dsSP.add(SanPham(4, "String", 20.0))

        var gson =Gson()
        var file = FileWriter("/home/nghianv/luudabgsachsanpham.json")
        gson.toJson(dsSP,file)
        file.close()
        println("Xuat Json thanh cong")
    } catch (ex: Exception) {
        ex.printStackTrace()
    }
}
fun main() {
//    luuNhieuDoiTuong()

    //Doc File Json
    var gson = Gson()
    var sp:SanPham = gson.fromJson(FileReader("/home/nghianv/doituongsanpham.json"), SanPham::class.java)
    println(sp)
    // Doc mot mang danh sach
    var dsSp:MutableList<SanPham> = gson.fromJson(FileReader("/home/nghianv/luudabgsachsanpham.json"),object :TypeToken<MutableList<SanPham>>(){}.type)
    println("-------------------")
    for (sp in dsSp) {
        println(sp)
    }

}