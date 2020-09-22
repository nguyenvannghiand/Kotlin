package com.nghianv.main

fun NhapGiaTri(): Double {
    var s: String? = readLine()
    if (s != null)
        return s.toDouble()
    return 0.0
}

fun main() {
    var a: Double = 0.0
    var b: Double = 0.0
    var c: Double = 0.0
    println("Nhập a:")
    a = NhapGiaTri()
    println("Nhập b:")
    b = NhapGiaTri()
    println("Nhập c:")
    c = NhapGiaTri()
    if (a == 0.0) {
        if (b == 0.0 && c == 0.0)
            println("PT Vô số No")
        else if (b == 0.0 && c != 0.0)
            println("PT Vô No")
        else
            println("X=" + (-c / b))
    } else {
        val delta: Double = Math.pow(b, 2.0) - 4 * a * c
        if (delta < 0)
            println("Vô nghiệm")
        else if (delta == 0.0) {
            var x: Double = -b / (2 * a)
            println("No kép x1=x2=$x")
        } else {
            var x1: Double = (-b - Math.sqrt(delta)) / (2 * a)
            var x2: Double = (-b + Math.sqrt(delta)) / (2 * a)
            println("x1=$x1")
            println("x2=$x2")
        }
    }
}