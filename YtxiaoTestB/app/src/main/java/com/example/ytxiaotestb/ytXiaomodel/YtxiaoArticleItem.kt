package com.example.ytxiaotestb.ytXiaomodel

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun YtxiaoArticleItem(item: YtxiaoArticle, modifier: Modifier = Modifier) {
    Column (modifier=Modifier.fillMaxWidth().padding(8.dp)){
        Text(
            text = item.title, fontSize = 30.sp
        )

        Icon(
            Icons.Default.FavoriteBorder,Color.DarkGray)
        Text(
            text = item.content + item.commentCount
        )

    }

}