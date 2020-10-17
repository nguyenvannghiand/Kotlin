package com.example.mvvmroom

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmroom.adapter.NoteAdapter
import com.example.mvvmroom.model.Note
import com.example.mvvmroom.viewmodel.NoteViewModeFactory
import com.example.mvvmroom.viewmodel.NoteViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var noteViewModel: NoteViewModel
    private lateinit var noteAdapter: NoteAdapter
    private lateinit var recycler_view: RecyclerView
    private lateinit var fab: FloatingActionButton
    private val ADD_NOTE_REQUEST = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        recycler_view = findViewById(R.id.recycler_view)
        fab = findViewById(R.id.fab)

        noteViewModel = ViewModelProvider(this,NoteViewModeFactory(application)).get(NoteViewModel::class.java)
        setupRecyclerView()
        noteViewModel.getAllNotes()
            .observe(this, Observer { listData -> listData?.let { noteAdapter.setNotesList(it) } })
        fab.setOnClickListener { view ->
            startActivityForResult(
                Intent(
                    this,
                    AddNoteActivity::class.java
                ), ADD_NOTE_REQUEST
            )
        }


    }

    private fun setupRecyclerView() {
        noteAdapter = NoteAdapter(delete = {
            val dialog = AskOption(it)
            dialog.show()
        })
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
        recycler_view.adapter = noteAdapter
    }

    private fun AskOption(note: Note): AlertDialog {
        return AlertDialog.Builder(this)
            .setTitle("Xoa")
            .setMessage("Ban co muon xoa ban ghi nay khong ? ")
            .setIcon(R.drawable.ic_delete)
            .setPositiveButton("Co",
                { dialog, whichButton ->
                    noteViewModel.deleteNote(note)
                    dialog.dismiss()
                })
            .setNegativeButton("Khong",
                { dialog, which -> dialog.dismiss() })
            .create()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_delete_all -> {
                noteViewModel.getAllNotes()
                Toast.makeText(this, "Da xoa tat ca ban ghi", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == ADD_NOTE_REQUEST && resultCode == Activity.RESULT_OK) {
            data?.let {
                val newNote = Note(
                    data.getStringExtra(AddNoteActivity.EXTRA_TITLE),
                    data.getStringExtra(AddNoteActivity.EXTRA_CONTENT)
                )
                noteViewModel.insert(newNote)
                Toast.makeText(this, "Them thanh cong", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, " Them khong thanh cong", Toast.LENGTH_SHORT).show()
        }
    }
}