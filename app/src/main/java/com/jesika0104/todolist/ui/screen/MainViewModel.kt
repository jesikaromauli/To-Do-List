package com.jesika0104.todolist.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jesika0104.todolist.database.TaskDao
import com.jesika0104.todolist.model.Task
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class MainViewModel(dao: TaskDao) : ViewModel() {

    val data: StateFlow<List<Task>> = dao.getTask().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = emptyList()
    )
    fun getTask(id: Long): Task? {
        return data.value.find { it.id == id }


















    }
}