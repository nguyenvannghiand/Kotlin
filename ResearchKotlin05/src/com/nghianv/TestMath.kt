package com.nghianv

fun main() {
    println("So PI = " + Math.PI)
    println("Can bac 2 cua 25 = " + Math.sqrt(25.0))
    println("3 mu 4 = " + Math.pow(3.0, 4.0))

    var goc = 30 // goc = 30 do
    var rad = (Math.PI * 30) / 180
    println("sin ($goc) = " + Math.sin(rad))
    println("cos ($goc) = " + Math.cos(rad))
    println("tan ($goc) = " + Math.tan(rad))
    println("cotan ($goc) = " + (1 / Math.tan(rad)))
    //
    var gocA = 45 // gocA = 45 do
    var radA = (Math.PI * gocA) / 180
    println("sin ($gocA) = " +Math.sin(radA))




}