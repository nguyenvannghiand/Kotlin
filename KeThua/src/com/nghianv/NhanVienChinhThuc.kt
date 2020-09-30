package com.nghianv

class NhanVienChinhThuc: NhanVien {
    constructor(ma: Int, ten: String) : super(ma, ten)

    override fun tinhLuong(ngayCong: Int): Int {
        var luong = if(ngayCong>=22) 10 else 8
        return luong
    }
}