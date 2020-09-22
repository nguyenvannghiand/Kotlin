package com.nghianv.main

fun main() {
    var x: Int = 0
    x += 5 // x = x + 5
    println(x)
    x = 7
    x %= 3
    println("x=" + x)
    var a:Int=5
    var b:Int=8
    var c:Int=2
    a--
    b++
    var z=a++ + ++b - --c + 7
    println("a="+a)
    println("b="+b)
    println("c="+c)
    println("z="+z)
    //
    var y: Int? = 5
    y = null
    println(y)
    var value: String? = null
    println(y)



}