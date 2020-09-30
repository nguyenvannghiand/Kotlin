package com.nghianv

open abstract class NhanVien {
    protected var ma: Int = 0
    protected var ten: String = ""

    //
    constructor() {
        ma = 0
        ten = "Empty"
    }

    constructor(ma: Int, ten: String) {
        this.ma = ma
        this.ten = ten
    }

    public abstract fun tinhLuong(ngayCong: Int): Int

    override fun toString(): String {
        return "$ma + $ten"
    }
}