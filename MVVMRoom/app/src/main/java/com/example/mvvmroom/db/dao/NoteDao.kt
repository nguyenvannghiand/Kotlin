package com.example.mvvmroom.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mvvmroom.model.Note

@Dao
interface NoteDao {
    @Insert
    fun insert(note: Note)

    @Query("DELETE FROM note_table")
    fun deleteAllNotes()

    @Delete
    fun deleteNote(note: Note)

    @Update
    fun updateNote(note: Note)

    @Query("SELECT * FROM note_table")
    fun getAllNotes(): LiveData<List<Note>>
}