package com.example.dataclass

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.dataclass.entidades.TaskEntity
import com.example.tarea4_1.TaskDao

@Database(entities = arrayOf(TaskEntity :: class), version = 1)
abstract class TasksDatabase : RoomDatabase() {
    abstract fun taskDao() : TaskDao
}