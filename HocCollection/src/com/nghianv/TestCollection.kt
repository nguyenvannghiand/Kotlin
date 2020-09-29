package com.nghianv

fun main() {
    var ds: List<Int> = listOf(6, 7, 8, 9)
    for (item in ds.indices) {
        print("${ds[item]}\t")
    }
    var dsChan = ds.filter { item->item % 2 == 0 }
    println("\n Cac so chan")
    for (item in dsChan.indices) {
        print("${dsChan[item]}\t")
    }

}