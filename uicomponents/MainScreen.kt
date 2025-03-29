package com.example.bweek04a.uicomponents

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bweek04a.model.Item
import com.example.bweek04a.model.TodoItemFactory

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    var showPendingOnly by remember { mutableStateOf(false) }
    val todoList = remember {
        mutableStateListOf<Item>()
        TodoItemFactory.makeTodoList()
    }
    Column (modifier = Modifier.fillMaxSize().padding(10.dp)) {
        TodoListTitle(modifier = Modifier.weight(1f))
        TodoSwitch(showPendingOnly, onCheckedChange = { showPendingOnly = it })
        Spacer(modifier = Modifier.height(8.dp))
        Box(modifier = Modifier.weight(1f)) {
        TodoList(todoList, showPendingOnly)
    }
    TodoItemInput(todoList,
        modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp))
}
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}

