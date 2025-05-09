package com.jesika0104.todolist.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.jesika0104.todolist.model.Task
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Insert
    suspend fun insert(description: Task)

    @Update
    suspend fun update(description: Task)

    @Query("SELECT * FROM description ORDER BY timestamp DESC")
    fun getTask(): Flow<List<Task>>

    @Query("SELECT * FROM description WHERE id = :id")
    suspend fun getTaskById(id: Long): Task?

    @Query("DELETE FROM description WHERE id = :id")
    suspend fun deleteById(id: Long)
}