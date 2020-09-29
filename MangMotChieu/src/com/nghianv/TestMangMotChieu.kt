package com.nghianv

fun main() {
    var arr: IntArray = IntArray(5)
    arr[0] = 40
    arr[1] = 50
    arr[2] = -20
    arr[3] = 40
    arr[4] = -30
    println("Mang sau khi nhap:")
    for (i in arr.indices) {
        print("${arr[i]}\t")
    }
    println("\nCac so am")
    var mangAm = arr.filter { x-> x < 0 }
    for (x in mangAm) {
        print("$x\t")
    }
    println()
    var max = arr.max()
    print("max = $max")
}