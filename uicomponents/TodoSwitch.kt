package com.example.bweek04a.uicomponents

import androidx.compose.foundation.layout.*
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TodoSwitch(isChecked:Boolean,
               modifier: Modifier = Modifier,
               onCheckedChange:(Boolean)->Unit
) {
    Column (){
        Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(10.dp)){
            Text(
                text = "미완료 항목만 보기",
                modifier = Modifier.weight(1f),
                fontSize = 20.sp,
                fontFamily = FontFamily.Default,
                textAlign = TextAlign.End,
            )
            Switch(
                checked = isChecked,
                onCheckedChange = onCheckedChange
            )

        }
    }
}

@Preview
@Composable
private fun TodoSwitchPreview() {
    TodoSwitch(false) { }
}