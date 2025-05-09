package com.jesika0104.todolist.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "description")
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val title: String,
    val description: String,
    val timestamp: String
)