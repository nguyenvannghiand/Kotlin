package com.nghianv.main

fun main() {
    var month: Int = 0
    println("Nhap thang:")
    var s: String? = readLine()
    if (s != null) {
        month = s.toInt()
    }
    when (month) {
        1, 2, 3 -> println("Thang " + month + " thuoc quy 1")
        4, 5, 6 -> println("Thang " + month + " thuoc quy 2")
        7, 8, 9 -> println("Thang " + month + " thuoc quy 3")
        10, 11, 12 -> println("Thang " + month + " thuoc quy 4")
        else -> println("Thang " + month + " khong hop le")
    }
}