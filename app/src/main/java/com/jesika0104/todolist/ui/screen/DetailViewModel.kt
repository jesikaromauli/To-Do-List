package com.jesika0104.todolist.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jesika0104.todolist.database.TaskDao
import com.jesika0104.todolist.model.Task
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


class DetailViewModel(private val dao: TaskDao) : ViewModel() {
    private val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)

    fun insert(title: String, content: String) {
        val task = Task(
            timestamp = formatter.format(Date()),
            title = title,
            description = content
        )
        viewModelScope.launch(Dispatchers.IO) {
            dao.insert(task)
        }
    }
    suspend fun getTask(id: Long): Task? {
        return dao.getTaskById(id)
    }

    fun update(id: Long, title: String, content: String) {
        val task = Task(
            id = id,
            timestamp = formatter.format(Date()),
            title = title,
            description = content
        )
        viewModelScope.launch(Dispatchers.IO) {
            dao.update(task)
        }
    }
    fun delete(id: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            dao.deleteById(id)
        }
    }
}