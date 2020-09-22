package com.example.oopkolin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sv1: Student = Student("Nguyen Van A", "Ha noi", 1999)
//        sv1.name = "Nguyen Van A"
//        sv1.address = "Ha Noi"
//        sv1.setBirthday(1990)
        Log.d("AAA", sv1.toString())
        Log.d("AAA", sv1.getBirthday().toString() + " - " + sv1.processAge().toString())
    }
}