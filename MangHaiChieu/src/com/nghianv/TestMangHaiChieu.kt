package com.nghianv

import kotlin.random.Random

fun main() {
    var arr:Array<IntArray> = Array(10, { IntArray(5) })
    var random = Random
    for (i in arr.indices) {
        for (j in arr[i].indices) {
            arr[i][j] = random.nextInt(100)
        }
    }
    println("mang hai chieu")
    for (i in arr.indices) {
        for (j in arr[i].indices) {
            print("${arr[i][j]}\t")
        }
        println()
    }
}
