package com.example.core.data.mapper

import com.example.core.data.local.TaskEntity
import com.example.core.domain.model.Task


fun TaskEntity.toDomain(): com.example.core.domain.model.Task {
    return com.example.core.domain.model.Task(id, title, description, isDone)
}

fun com.example.core.domain.model.Task.toEntity(): TaskEntity {
    return TaskEntity(id, title, description, isDone)
}