package com.example.bweek04a.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bweek04a.model.Item
import com.example.bweek04a.model.TodoItemFactory
import com.example.bweek04a.model.TodoStatus

@Composable
fun TodoList(todoList:MutableList<Item>, showPendingOnly: Boolean, modifier: Modifier = Modifier) {

    val scrollState = rememberScrollState()
    val filteredList = if (showPendingOnly) {
        todoList.filter { it.status == TodoStatus.PENDING }
    } else {
        todoList
    }
    Column(modifier = Modifier.fillMaxWidth().padding(10.dp).verticalScroll(scrollState)) {
        filteredList.forEachIndexed { index, item ->
            Card (modifier = Modifier.fillMaxWidth()){
                Row (verticalAlignment = Alignment.CenterVertically){
                    TodoCheckBox(isChecked = item.status==TodoStatus.COMPLETED) {
                        status-> todoList[index] = item.copy(
                            status = if(status)
                            TodoStatus.COMPLETED else TodoStatus.PENDING
                        )
                    }
                    TodoItem(item)
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
        }

    }
}

@Preview
@Composable
private fun TodoListPreview() {
    TodoList(TodoItemFactory.makeTodoList(), showPendingOnly = false)
}