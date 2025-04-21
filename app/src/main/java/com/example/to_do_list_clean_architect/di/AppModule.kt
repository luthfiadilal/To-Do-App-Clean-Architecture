package com.example.to_do_list_clean_architect.di

import android.app.Application
import androidx.room.Room
import com.example.core.data.local.TaskDatabase
import com.example.core.data.repository.TaskRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTaskDatabase(app: Application): TaskDatabase {
        return Room.databaseBuilder(
            app,
            TaskDatabase::class.java,
            "task_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTaskRepository(db: TaskDatabase): com.example.core.domain.repository.TaskRepository {
        return TaskRepositoryImpl(db.taskDao)
    }

    @Provides
    @Singleton
    fun provideGetTasksUseCase(repository: com.example.core.domain.repository.TaskRepository): com.example.feature_task.domain.usecase.GetTasksUseCase {
        return com.example.feature_task.domain.usecase.GetTasksUseCase(repository)
    }
}