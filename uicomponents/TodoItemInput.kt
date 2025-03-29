package com.example.bweek04a.uicomponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bweek04a.model.Item
import com.example.bweek04a.model.TodoItemFactory
import com.example.bweek04a.model.TodoStatus
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun TodoItemInput(todoList:MutableList<Item>, modifier: Modifier = Modifier) {

    Alignment.Bottom
    var textFieldState by remember {
        mutableStateOf(value = "")
    }
    Row (modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically){
        TextField(value = textFieldState,
            onValueChange = {content -> textFieldState = content},
            placeholder = {Text(text = "할 일을 입력하세요")},
            modifier = Modifier.weight(1f)
            )
        Spacer(modifier = Modifier.width(10.dp))
        Button(
            onClick =  {
            if (textFieldState.isNotBlank()) {
                val currentTime = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
                    .format(Date())

                val newItem = Item(
                    content = textFieldState,
                    time = currentTime,
                    status = TodoStatus.PENDING
                )

                todoList.add(newItem)
                textFieldState = ""
            }}) {
            Text("추가")
        }
    }
}

@Preview
@Composable
private fun TodoItemInputPreview() {
    TodoItemInput(TodoItemFactory.makeTodoList())
}

