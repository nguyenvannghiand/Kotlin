package com.nghianv.applearnmatch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number1: Int = 0
    var number2: Int = 0
    var ketqua: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_cong.setOnClickListener {
            getNumberInput()
            ketqua = number1 + number2
            txt_ketqua.text = ketqua.toString()
        }
        button_tru.setOnClickListener {
            getNumberInput()
            ketqua = number1 - number2
            txt_ketqua.text = ketqua.toString()
        }
        button_nhan.setOnClickListener {
            getNumberInput()
            ketqua = number1 * number2
            txt_ketqua.text = ketqua.toString()
        }
        button_chia.setOnClickListener {
            getNumberInput()
            ketqua = number1 / number2
            txt_ketqua.text = ketqua.toString()
        }
    }

    fun getNumberInput() {
        number1 = (edt_number1.text.toString()).toInt()
        number2 = (edt_number2.text.toString()).toInt()
    }
}