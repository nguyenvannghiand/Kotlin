package com.nghianv

fun main() {
    var sv1 = SinhVien(1, "Nguyen Van A")
    println(sv1.Ma)
    println(sv1.Ten)
    sv1.Ma = 113
    sv1.Ten = "Nguyen Hoang Anh"
    println("${sv1.Ma} - ${sv1.Ten}")
    var student:Student = Student()
    student.ma = 2
    student.hashCode()

    println(student.toString())
}