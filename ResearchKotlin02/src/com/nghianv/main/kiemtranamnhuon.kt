package com.nghianv.main

fun main() {
    var year: Int = 0
    var s: String?
    println("Chuong tirnh kiem tra nam nhuan")
    do {
        println("Nhap 1 nam: ")
        s = readLine()
        while (s == null || s.toInt() < 0) {
            println("Nhap sai nam, nhap lai:")
            s = readLine()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Nam $year la nam nhuan")
        } else {
            println("Nam $year khong phai nam nhuan")
        }
        println("Tiep khong? (c/k):")
        s = readLine()
        if (s == "k") {
            break
        }
    } while (true)
    println("Tam biet")
}