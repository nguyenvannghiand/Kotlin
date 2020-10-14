package com.nghianv

class SinhVien {
    private var ma: Int = 0
    private var ten: String = ""

    constructor() {}
    constructor(m: Int, t: String) {
        this.ma = m
        ten = t
    }

    public var Ma: Int
        get() {
            return ma
        }
        set(value) {
            ma = value
        }
    public var Ten: String
        get() {
            return ten
        }
        set(value) {
            ten = value
        }

}