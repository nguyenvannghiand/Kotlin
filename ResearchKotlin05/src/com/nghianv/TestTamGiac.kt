package com.nghianv

fun main() {
    var a: Double?
    var b: Double?
    var c: Double?
    println("Nhap canh a: ")
    a = readLine()?.toDouble()
    println("Nhap canh b:")
    b = readLine()?.toDouble()
    println("Nhap canh c:")
    c = readLine()?.toDouble()
    if (a == null || b == null || c == null || ((a + b) < c) || (a + c) < b || ((b + c) < a))  return
    var p = (a + b + c) / 2
    var dt = Math.sqrt(p * (p - a) * (p - b) * (p - c))
    println("Dien  tich = $dt")
}