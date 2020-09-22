package com.nghianv.main

fun main() {
    var a: Double = 0.0
    var b: Double = 0.0
    var pheptoan: String?
    println("Nhap a:")
    var sa = readLine()
    if (sa != null) {
        a = sa.toDouble()
    }
    println("Nhap b:")
    var sb = readLine()
    if (sb != null) {
        b = sb.toDouble()
    }
    println("Nhap phep toan (+,-,*,/) :")
    pheptoan = readLine()
    when (pheptoan) {
        "+" -> println(a.toString() + " + " + b.toString() + " = " + (a + b))
        "-" -> println(a.toString() + " - " + b.toString() + " = " + (a - b))
        "*" -> println(a.toString() + " * " + b.toString() + " = " + (a * b))
        "/" ->
            if (b == 0.0) {
                println("Mau so phai khac 0")
            } else {
                println(a.toString() + " / " + b.toString() + " = " + (a / b))
            }
        else -> println("ban nhap lai")

    }
}

