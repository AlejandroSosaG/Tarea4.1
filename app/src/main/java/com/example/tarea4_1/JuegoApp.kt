package com.example.tarea4_1

import android.app.Application
import androidx.room.Room
import com.example.dataclass.TasksDatabase

class JuegoApp: Application() {
    companion object {
        lateinit var database: TasksDatabase
    }
    override fun onCreate() {
        super.onCreate()
        database =  Room.databaseBuilder(this, TasksDatabase::class.java, "juego-db").build()
    }
}