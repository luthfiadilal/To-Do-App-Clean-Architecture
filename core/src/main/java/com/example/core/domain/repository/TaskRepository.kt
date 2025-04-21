package com.example.core.domain.repository

import androidx.lifecycle.LiveData
import com.example.core.domain.model.Task

interface TaskRepository {
    fun getTasks(): LiveData<List<Task>>
    fun addTask(task: Task)
    fun deleteTask(task: Task)
    fun updateTask(task: Task)
}