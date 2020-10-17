package com.example.mvvmroom.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.mvvmroom.db.repository.NoteRepository
import com.example.mvvmroom.model.Note

class NoteViewModel(application: Application) : AndroidViewModel(application) {
    private var repository: NoteRepository = NoteRepository(application)
    private var allNotes: LiveData<List<Note>> = repository.getAllNotes()

    fun insert(note: Note) {
        repository.insert(note)
    }

    fun deleteNote(note: Note) {
        repository.deleteNote(note)
    }

    fun deleteAllNotes() {
        repository.deteleAllNotes()
    }

    fun updateNote(note: Note) {
        repository.updateNote(note)
    }

    fun getAllNotes(): LiveData<List<Note>> {
        return allNotes
    }
}