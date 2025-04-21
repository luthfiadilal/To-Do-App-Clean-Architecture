package com.example.to_do_list_clean_architect

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.feature_task.presentation.add_edit_task.AddToDoScreen
import com.example.to_do_list_clean_architect.ui.theme.ToDoListCleanArchitectTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddToDoActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoListCleanArchitectTheme {
                Scaffold {
                    AddToDoScreen()
                }
            }
        }
    }
}

// preview

@Preview(showBackground = true)
@Composable
fun AddToDoPreview() {
    ToDoListCleanArchitectTheme {
        AddToDoScreen()
    }
}