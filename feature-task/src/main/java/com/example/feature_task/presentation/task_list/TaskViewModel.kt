package com.example.feature_task.presentation.task_list

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.core.domain.model.Task
import com.example.core.domain.repository.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TaskListViewModel @Inject constructor(
    private val repository: com.example.core.domain.repository.TaskRepository
) : ViewModel() {

    val tasks: LiveData<List<com.example.core.domain.model.Task>> = repository.getTasks()

    fun addTask(task: com.example.core.domain.model.Task) {
        repository.addTask(task)
    }

    fun deleteTask(task: com.example.core.domain.model.Task) {
        repository.deleteTask(task)
    }

    fun updateTask(task: com.example.core.domain.model.Task) {
        repository.updateTask(task)
    }
}