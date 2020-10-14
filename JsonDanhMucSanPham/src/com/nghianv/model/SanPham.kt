package com.nghianv.model

class SanPham {
    var ma: Int = 0
    var ten: String = ""
    var gia: Double = 0.0
    //
    constructor()
    constructor(ma: Int, ten: String, gia:Double){
        this.ma = ma
        this.ten = ten
        this.gia = gia
    }

    override fun toString(): String {
        return "$ma\t$ten\t$gia"
    }

}