package com.nghianv

fun main() {
    var danhsach:MutableList<Int> = mutableListOf()
    while (true) {
        println("Nhap gia tri")
        var x: Int? = readLine()?.toInt()
        if (x == null) return
        danhsach.add(x)
        println("Tiep ko? (c/k) :")
        var hoi = readLine()
        if (hoi?.equals("k", true) == true) break

    }
    println("Collection sau khi nhap la")
    for (item in danhsach) {
        print("$item\t")
    }
    // Edit phan tu
    println("\n Ban muon sua so o vi tri thu may:")
    var vitri = readLine()?.toInt()
    if (vitri == null || vitri >= danhsach.size) return
    println("Moi nhap gia tri moi:")
    var giatri = readLine()?.toInt()
    if (giatri == null) return
    danhsach[vitri] = giatri
    println("Collection sau khi sua la: ")
    for (item in danhsach) {
        print("$item\t")
    }
    // Xoa phan tu
    println("Ban muon xoa vi tri nao: ")
    var vitriXoa = readLine()?.toInt()
    if (vitriXoa != null && vitriXoa >= 0 && vitriXoa < danhsach.size) {
        danhsach.removeAt(vitriXoa)
    }
    // Tim kiem phan tu
    println("\n Ban muon tim so nao")
    var soTim = readLine()?.toInt()
    if (soTim == null) return
    var kq = danhsach.filter { x-> x == soTim }
    if (kq.size > 0) {
        println("Co tim thay $soTim")
    } else {
        println("Khong tim thay $soTim")
    }
}