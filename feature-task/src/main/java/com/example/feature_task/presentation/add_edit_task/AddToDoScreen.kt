package com.example.feature_task.presentation.add_edit_task

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable

import android.app.Activity
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@SuppressLint("ContextCastToActivity")
@Composable
fun AddToDoScreen(
    viewModel: AddToDoViewModel = hiltViewModel()
) {
    val context = LocalContext.current as Activity

    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = title,
            onValueChange = { title = it },
            label = { Text("Title") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = description,
            onValueChange = { description = it },
            label = { Text("Description") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                viewModel.addTask(title, description)
                context.finish() // kembali ke MainActivity
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text("Save")
        }
    }
}