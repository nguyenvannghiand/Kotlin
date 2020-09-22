package com.nghianv.main

fun main() {
    var a: Int = 10
    var b: Int = 15
    var max: Int
    max = if (a > b) a else b
    println("So lon nhat =" + max)
    //
    var value: Int = 2
    when (value) {
        1 -> println("Hello Obama")
        2 -> println("Hello Putin")
        3 -> println("Hello Kim Jong Un")
        else -> println("Hello Everyone!")

    }
}