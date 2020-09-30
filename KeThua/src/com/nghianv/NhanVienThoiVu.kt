package com.nghianv

class NhanVienThoiVu : NhanVien {
    constructor(ma: Int, ten: String) : super(ma, ten)

    override fun tinhLuong(ngayCong: Int): Int {
        return ngayCong * 150000
    }
}