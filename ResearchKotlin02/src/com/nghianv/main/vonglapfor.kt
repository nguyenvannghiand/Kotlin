package com.nghianv.main

fun main() {
    var gt: Int = 1
    val n: Int = 5
    for (i in 1..5) {
        gt *= i
    }
    println("$n! = $gt")
    //
    var sum: Int = 0
    for (i in 1 until n) {
        sum += i
    }
    println("Tong = $sum")
    //
    var sum2: Int = 0
    val m: Int = 10
    for (i in 0 .. m step 2) {
        sum2 += i
    }
    println("Tong chan = $sum2")

    // lap doi tuong
    var dsSanPham = arrayOf("Kotlin", "Java", "C#", "Python")
    for (item in dsSanPham) {
        println(item)
    }
    for (i in dsSanPham.indices) {
        println("Sanpham thu $i co ten " + dsSanPham[i])
    }
    //
    for ((index, value) in dsSanPham.withIndex()) {
        println("San pham thu $index co ten $value")
    }
}