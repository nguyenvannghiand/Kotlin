package com.nghianv.model

import java.lang.StringBuilder

class DanhMuc {
    var maDanhMuc: Int = 0
    var tenDanhMuc: String = ""
    var danhSachSanPham: MutableList<SanPham> = mutableListOf()

    constructor()
    constructor(maDanhMuc: Int, tenDanhMuc: String) {
        this.maDanhMuc = maDanhMuc
        this.tenDanhMuc = tenDanhMuc
    }

    override fun toString(): String {
        var msg = "$maDanhMuc\t$tenDanhMuc"
        var sb = StringBuilder()
        sb.append(msg)
        sb.append("\n")
        sb.append("--------------------\n")
        for (sp in danhSachSanPham) {
            sb.append(sp.toString())
            sb.append("\n")
        }
        return sb.toString()
    }

}