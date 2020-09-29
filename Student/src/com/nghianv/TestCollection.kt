package com.nghianv

fun menu() {
    println("1. Them Sinh vien")
    println("2. Xuat danh sach Sinh vien")
    println("3. Sua Sinh vien")
    println("4. Xoa Sinh vien")
    println("5. Tim Sinh vien chua ten bat ky")
    println("6. Sap xep danh sach sinh vien")
    println("7. Xuat ra so luong sinh vien")
    println("8. Thoat phan mem")
    println("Moi ban lua chon chuc nang")
    var chon = readLine()?.toInt()
    if (chon == null) {
        System.exit(0)
    }
    when (chon) {
        1 -> println("Ban goi ham them sinh vien")
        2 -> println("Ban goi xuat danh sach sinh vien")
        3 -> println("Ban goi ham sua sinh vien")
        4 -> println("Ban goi ham xoa sinh vien")
        5 -> println("Ban goi ham tim kiem sinh vien")
        6 -> println("Ban goi ham sap xep danh sach sinh vien")
        7 -> println("Ban goi ham xuat ra so luong sinh vien")
        8 -> System.exit(0)
    }
}

fun main() {
    while (true) {
        menu()
    }
}