package com.nghianv

fun main() {
    var ds: MutableList<Int> = mutableListOf()
    ds.add(5)
    ds.add(10)
    ds.addAll(mutableListOf(2, 4, 7))
    for (item in ds) {
        print("$item\t")
    }
    ds.sort()
    println("\n sap xep tang dan:")
    for (item in ds) {
        print("$item\t")
    }
    ds.sortDescending()
    println("\n Sap xep giam dan")
    for (item in ds) {
        print("$item\t")
    }
    ds.removeAt(1)
    println("\n sau khi xoa so 7")
    for (item in ds) {
        print("$item\t")
    }
    var dsLe = ds.filter { x-> x % 2 != 0 }
    println("\n Danh sach so le la:")
    for (item in dsLe) {
        print("$item\t")
    }

}