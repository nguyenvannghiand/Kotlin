package com.nghianv

fun main() {
    var s = "Kotlin,Java,IOS,Phython,C+"
    var arr: List<String> = s.split(",")
    println("so phan tu trong danh sach = ${arr.size}")
    for (item in arr) {
        println(item)
    }

}