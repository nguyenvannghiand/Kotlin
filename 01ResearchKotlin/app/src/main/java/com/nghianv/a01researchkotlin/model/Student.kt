package com.nghianv.a01researchkotlin.model

class Student {
    private var name: String = ""
    private var address: String = ""
    private var yearBirthday: Int = 0


    constructor()

    constructor(name: String, address: String, yearBirthday: Int) {
        this.name = name
        this.address = address
        this.yearBirthday = yearBirthday
    }


    fun setName(name:String): Unit{
        this.name = name
    }
    fun getName(): String {
        return this.name
    }
    fun setAddress(address: String): Unit {
        this.address = address
    }
    fun getAddress(): String {
        return this.address
    }
    fun setYearBirthday(year: Int) {
        if (year > 1999) {
            this.yearBirthday = 1999
        } else {
            this.yearBirthday = year
        }
    }
    fun getYearBirthday(): Int {
        return this.yearBirthday
    }

}