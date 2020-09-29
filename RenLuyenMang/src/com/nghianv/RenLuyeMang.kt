package com.nghianv

import kotlin.random.Random

fun main() {
    var n: Int?
    println("Nhap so phan tu cua mang")
    n = readLine()?.toInt()
    if (n == null || n <= 0) return
    var mang: IntArray = IntArray(n)
    var rand = Random
    for (i in mang.indices) {
        mang[i] = rand.nextInt(100)
    }
    println("Danh sach cac phan tu trong mang:")
    for (item in mang) {
        print("$item\t")
    }
    var sum = mang.sum()
    println("\nTong mang =  $sum")
    println("Nhap k: ")
    var k: Int? = readLine()?.toInt()
    if (k == null) return
    var dem = 0
    for (item in mang) {
        if (item == k) {
            dem++
        }
    }
    println("So $k xuat hien $dem lan")
    println("--- Danh sach so nguyen to")
    var dsSoNguyenTo = mang.filter { x ->
        var dem = 0
        for (i in 1..x) {
            if (x % i == 0) {
                dem++
            }
        }
        dem == 2
    }
    println("Cac so nguyen to:")
    for (item in dsSoNguyenTo) {
        print("$item\t")
    }
    mang.sort()
    println("\n danh sach cac phan tu tang dan:")
    for (item in mang) {
        print("$item\t")
    }
}