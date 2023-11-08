package com.example.tarea4_1

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.tarea4_1.entidades.Datos

@Dao
interface TaskDao {
    @Query("SELECT * FROM datos")
    suspend fun getAllTasks(): MutableList<Datos>  // Función que devuelve todas las tareas de la base de datos en una lista Mutable.

    @Insert
    suspend fun addTask(taskEntity : Datos):Long    // Función que añade una tarea, la que se pasa por parámetro, y devuelve el id insertado.                                                          // Devuelve Long porque la cantidad de datos guardada puede ser muy alto.

    @Query("SELECT * FROM datos where id like :id")
    suspend fun getTaskById(id: Long): Datos        // Función que busca tareas por id (debe ser Long, no Int)

    @Update
    suspend fun updateTask(task: Datos):Int         // Función que actualiza una tarea y devuelve

    @Delete
    suspend fun deleteTask(task: Datos):Int         // Función que borra una tarea y devuelve
}