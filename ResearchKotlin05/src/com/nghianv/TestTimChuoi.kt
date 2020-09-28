package com.nghianv

fun main() {
    var s: String = "Nguyen Thi Long Lanh"
    var i1 = s.indexOf("o")
    println(i1)
    var i2 = s.lastIndexOf("n")
    println(i2)
    var i3 = s.contains("Long")
    println(i3)
    var i4 = s.contains("Anh", true)
    var i5 = s.contains("Anh", false)
    println(i4)
    println(i5)
}