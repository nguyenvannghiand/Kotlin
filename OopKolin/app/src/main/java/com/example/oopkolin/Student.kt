package com.example.oopkolin

class Student {
    private var name: String = ""
    private var address: String = ""
    private var birthday: Int = 0


    constructor()

    constructor(name: String, address: String, birthday: Int) {
        this.name = name
        this.address = address
        this.birthday = birthday
    }


    fun processAge(): Int {
        return 2020 - birthday
    }

    fun setBirthday(year: Int) {
        if (year > 1999) {
            birthday = 1999
        } else {
            birthday = year
        }
    }

    fun getBirthday(): Int {
        return birthday
    }

    override fun toString(): String {
        return "Student(name='$name', address='$address', birthday=$birthday)"
    }

}