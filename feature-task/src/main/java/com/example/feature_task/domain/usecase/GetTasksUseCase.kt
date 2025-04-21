package com.example.feature_task.domain.usecase

import androidx.lifecycle.LiveData
import com.example.core.domain.model.Task
import com.example.core.domain.repository.TaskRepository


class GetTasksUseCase(private val repository: TaskRepository) {
    operator fun invoke(): LiveData<List<Task>> = repository.getTasks()
}