package com.example.mvvmroom.db.repository

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.LiveData
import com.example.mvvmroom.db.NoteDatabase
import com.example.mvvmroom.db.dao.NoteDao
import com.example.mvvmroom.model.Note

class NoteRepository(application: Application) {
    private var noteDao: NoteDao
    private var allNotesList: LiveData<List<Note>>

    init {
        val database: NoteDatabase = NoteDatabase.getInstance(application.applicationContext)
        noteDao = database.noteDao()
        allNotesList = noteDao.getAllNotes()
    }

    fun insert(note: Note) {
        InsertNoteAsyncTask(noteDao).execute(note)
    }

    fun deleteNote(note: Note) {
        InsertNoteAsyncTask(noteDao).execute(note)
    }

    fun deteleAllNotes() {
        InsertNoteAsyncTask(noteDao).execute()
    }

    fun updateNote(note: Note){
        InsertNoteAsyncTask(noteDao).execute(note)
    }
    fun getAllNotes(): LiveData<List<Note>>{
        return allNotesList
    }

    private class InsertNoteAsyncTask(val noteDao: NoteDao) : AsyncTask<Note, Unit, Unit>() {

        override fun doInBackground(vararg notes: Note?) {
            noteDao.insert(notes[0]!!)
        }
    }

    private class DeleteNoteAsyncTask(val noteDao: NoteDao) : AsyncTask<Note, Unit, Unit>() {
        override fun doInBackground(vararg notes: Note?) {
            notes[0]?.let { noteDao.deleteNote(it) }
        }
    }

    private class UpdateNoteAsyncTask(val noteDao: NoteDao) : AsyncTask<Note, Unit, Unit>() {
        override fun doInBackground(vararg notes: Note?) {
            notes[0]?.let { noteDao.updateNote(it) }
        }
    }

    private class DeleteAllNotesAsyncTask(val noteDao: NoteDao) : AsyncTask<Note, Unit, Unit>() {
        override fun doInBackground(vararg notes: Note?) {
            noteDao.deleteAllNotes()
        }
    }

}