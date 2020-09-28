package com.nghianv.main

import java.lang.NumberFormatException

fun main() {
    while (true) {
        var a: Int = 0
        var b: Int = 0
        var s: String?
        println("Nhap a:")
        s = readLine()
        while (s == null || s.length == 0) {
            println("Moi ban nhap lai")
            s = readLine()
        }
        try {
            if (s != null && s.length > 0) {
                a = s.toInt()
            }

        } catch (e: NumberFormatException) {
            println("Moi ban nhap lai la so")
            s = readLine()
            a = s!!.toInt()
        }
        println("Nhap b:")
        s = readLine()
        while (s == null || s.length == 0) {
            println("Moi ban nhap lai")
            s = readLine()
        }
        try {
            if (s != null && s.length > 0) {
                b = s.toInt()
            }
        } catch (e: NumberFormatException) {
            println("Moi ban nhap lai la so")
            s = readLine()
            b = s!!.toInt()
        }
        println("$a + $b = ${a + b}")
        println("Tiep khong? (c/k)")
        val line: String? = readLine()
        if (line.equals("k", true)) {
            break
        }
    }

}