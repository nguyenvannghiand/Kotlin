package com.nghianv.model

class DanhMuc {
    var maDanhMuc: Int = 0
    var tenDanhMuc: String = ""
    var dsSanPham: MutableList<SanPham> = mutableListOf()
    //
    constructor()
    constructor(maDanhMuc: Int, tenDanhMuc: String){
        this.maDanhMuc = maDanhMuc
        this.tenDanhMuc = tenDanhMuc
    }

    override fun toString(): String {
        var msg = "$maDanhMuc\t$tenDanhMuc"
        var stringBuffer = StringBuffer()
        stringBuffer.append(msg)
        stringBuffer.append("\n")
        stringBuffer.append("----------------\n")
        for (sp in dsSanPham){
            stringBuffer.append(sp.toString())
            stringBuffer.append("\n")
        }
        return stringBuffer.toString()
    }
}