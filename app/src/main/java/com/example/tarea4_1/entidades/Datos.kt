package com.example.tarea4_1.entidades

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "datos")
data class Datos(
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    var nombre:String = "",
    var numPartidas:Int = 0,
    var puntuacionMax : Int = 0
)
