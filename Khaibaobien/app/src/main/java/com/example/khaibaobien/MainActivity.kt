package com.example.khaibaobien

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        var a : String = ""
        a = "Kotlin"
        a.toInt()
        val b: String = "Value"
         */

        /*
        var a: Int = 10
        var b: Int = 15
        if (a > b) {
            Log.d("AAA","Gia tri lon nhat la :" + a)
        } else {
            Log.d("AAA","Gia tri lon nhat la : " + b)
        }
         */

//        var a: String = "Java"
//        when (a) {
//            "Kotlin" -> Log.d("AAA", "Hello Kotlin")
//            "Java" -> Log.d("AAA", "Hello Java")
//        }

        var a: Int = 15
        when (a) {
            in 1..3 -> Log.d("AAA", "Quy 1")
            in 4..6 -> Log.d("AAA", "Quy 2")
            7, 8, 9 -> Log.d("AAA", "Quy 3")
            10, 11, 12 -> Log.d("AAA", "Quy 4")
            else -> Log.d("AAA", "Khong co gia tri cua quy")

        }

        var b: Int = 0
        while (b < 10) {
            Log.d("AAA", "Hello" + b)
            b++
        }

        for (i in 0..10) {
            Log.d("AAA", " Hi : " + i)
        }
        var c: Int = 5
        for (i in 0 until c) {
            Log.d("AAAA", "Location: " + i)
        }
        var d: Int = 5
        for (i in d downTo 0) {
            Log.d("AAAA", "Gia tri duoc lap lai : " + i)
        }

        var e: Int = 10
        for (i in 0..e step 2) {
            Log.d("BBB", "Hello : " + i)
        }

//        cach 1
//        var mangso: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 9, 10)
//        mangso.get(1)


//        cach 2
        var arrayName: List<String> = listOf("Java", "Kotlin", "Ios")
        arrayName.get(2)

//        cach 3
        /*
        var array: ArrayList<String> = ArrayList()
        array.add("Java")
        array.add("Kotlin")
        array.add("Python")
        array.add("Ios")
        array.size
        //xoa phan tu trong mang
        array.remove("Ios")
        array.removeAt(2)
        //sua gia tri trong mang
        array.set(0,"Ios")
        Log.d("CCC", array.get(0))
        Log.d("CCC", array.size.toString())
         */
        showName("Java")

    }

    fun showName(name: String) {
        Log.d("CCC", "Hello :" + name)
    }
}