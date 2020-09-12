package com.nghianv.a01researchkotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.nghianv.a01researchkotlin.model.PhuongTien
import com.nghianv.a01researchkotlin.model.Student

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //01 khai bao mang
        var mangso: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        mangso.get(5)
        var arrayName: List<String> = listOf("Kotlin", "Java", "Android")
        var array: ArrayList<String> = ArrayList()
        array.add("Kotlin")
        array.add("Java")
        array.add("Android")
        array.add("ios")
        array.size
        //xoa phan tu trong mang
        array.removeAt(3)
        array.set(2, "Python")
        Log.d("AAA", "Phan tu vi tri index = 2 cua mang :" + array.get(2))
        showName()
        showName("Java")
        //

        var student1: Student = Student("Nguyen Van A", "Ha Noi", 1990)
//        student1.setName("Nguyen Van A")
//        student1.setAddress("Ha Noi")
//        student1.setYearBirthday(1995)
        Log.d(
            "BBB",
            student1.getName() + " - " + student1.getAddress() + " - " + student1.getYearBirthday()
        )
        //
        var phuongTien: PhuongTien = PhuongTien("Xedap", "Mau xanh", 2)
        Log.d("BBB", "Phuong tien: ${phuongTien.ten} , ${phuongTien.mau} , So banh: ${phuongTien.soBanh}")

    }

    fun showName() {
        Log.d("AAA", "Ham showName() da duoc thuc thi")
    }

    fun showName(name: String) {
        Log.d("AAA", "Hello " + name)
    }
}