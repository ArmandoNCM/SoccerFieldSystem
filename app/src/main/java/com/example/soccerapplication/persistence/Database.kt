package com.example.soccerapplication.persistence

import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import com.example.soccerapplication.application.ApplicationCore
import com.example.soccerapplication.persistence.dao.PlayerDao

@android.arch.persistence.room.Database(entities = [PlayerDao::class], version = 1, exportSchema = false)
abstract class Database : RoomDatabase() {


    companion object {

        private const val DATABASE_NAME : String = "soccer_database";

        val instance : Database? = ApplicationCore.instance?.let {
            Room.databaseBuilder(it.applicationContext, Database::class.java, DATABASE_NAME).build()
        }

    }
}