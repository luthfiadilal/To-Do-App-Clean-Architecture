package com.example.feature_task.presentation.add_edit_task

import androidx.lifecycle.ViewModel
import com.example.core.domain.model.Task
import com.example.core.domain.repository.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddToDoViewModel @Inject constructor(
    private val repository: com.example.core.domain.repository.TaskRepository
) : ViewModel() {

    fun addTask(title: String, description: String) {
        val task = com.example.core.domain.model.Task(
            id = 0, // auto-generate oleh Room
            title = title,
            description = description
        )
        repository.addTask(task)
    }
}