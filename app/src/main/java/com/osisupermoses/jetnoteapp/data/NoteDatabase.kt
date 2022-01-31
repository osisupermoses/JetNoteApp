package com.osisupermoses.jetnoteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.osisupermoses.jetnoteapp.model.Note
import com.osisupermoses.jetnoteapp.util.DateConverter
import com.osisupermoses.jetnoteapp.util.UUIDConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)  // so as to make room understand our converters
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}