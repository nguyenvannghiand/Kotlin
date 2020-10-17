package com.example.mvvmroom.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mvvmroom.db.dao.NoteDao
import com.example.mvvmroom.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao

    companion object {
        private var instance: NoteDatabase? = null

        fun getInstance(context: Context): NoteDatabase {
            if (instance == null) {
                synchronized(NoteDatabase::class) {
                    if (instance == null) {
                        instance = Room.databaseBuilder(
                            context.applicationContext,
                            NoteDatabase::class.java, "notes_database"
                        )
                            .fallbackToDestructiveMigration()
                            .build()
                    }
                }
            }
            return instance!!
        }

        fun destroyInstance() {
            instance = null
        }
    }
}