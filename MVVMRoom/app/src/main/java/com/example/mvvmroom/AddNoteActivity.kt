package com.example.mvvmroom

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddNoteActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TITLE = "com.example.mvvm_room.EXTRA_TITLE"
        const val EXTRA_CONTENT = "com.example.mvvm_room.EXTRA_CONTENT"
    }

    private lateinit var btnAdd: Button
    private lateinit var edtTitle: EditText
    private lateinit var edtContent: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_note_activity)
        btnAdd = findViewById(R.id.btnAdd)
        edtTitle = findViewById(R.id.edtTittle)
        edtContent = findViewById(R.id.edtContent)
        btnAdd.setOnClickListener { saveNote() }

    }

    private fun saveNote() {
        if (edtTitle.text.toString().trim().isBlank() || edtContent.text.toString().trim()
                .isBlank()
        ) {
            Toast.makeText(this, "Nhap day du thong tin", Toast.LENGTH_SHORT).show()
        }
        val data = Intent().apply {
            putExtra(EXTRA_TITLE, edtTitle.text.toString())
            putExtra(EXTRA_CONTENT, edtContent.text.toString())
        }
        setResult(Activity.RESULT_OK, data)
        finish()
    }
}