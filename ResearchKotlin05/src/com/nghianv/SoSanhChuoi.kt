package com.nghianv

fun main() {
    var s1 = "KOTLIN"
    var s2 = "kotlin"
    var kq = s1.compareTo(s2, true)
    if (kq == 0) {
        println("s1 = s2")
    }else if (kq > 0) {
        println("s1 > s2")
    } else {
        println("s1 < s2")
    }
}