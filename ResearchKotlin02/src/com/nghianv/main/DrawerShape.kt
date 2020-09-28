package com.nghianv.main

fun shap(h: Int) {
    for (i in 0..h - 1) {
        for (j in i..h - 1) {
            print("*")
        }
        println()
    }
}
fun shapC(h: Int) {
    for (i in 0..h - 1) {
        for (j in 0..h - 1) {
            if (i + j >= h - 1) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}
fun shapB(h: Int) {
    for (i in 0..h - 1) {
        for (j in 0..h - 1) {
            if (j == h / 2 || (i + j == h - 1) || (i == 0 && j >= h / 2) || (i == h - 1 && j <= h / 2)) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

fun main() {
    shap(10)
    shapC(8)
    shapB(10)
}