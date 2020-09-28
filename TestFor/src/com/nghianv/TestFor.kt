package com.nghianv

fun main() {
    var dsTen = arrayOf("Kotlin", "C#", "Android", "Java")
    for (item in dsTen) {
        println(item)
    }
    println("--------------------")
    for (i in dsTen.indices) {
        println("Vi tri thu $i = ${dsTen[i]}")
    }
    println("--------------------")
    for ((index, value) in dsTen.withIndex()) {
        println("Vi tri $index = $value")
    }
}