package com.example.ytxiaotestb.ytXiaomodel

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.navigation.NavController
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ytXiaoDetailScreen(title: String,
                       image: Image,
                       comment: String,
                       navController: NavController
) {
    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.Start
    ){
        Text("$title", fontSize = 40.sp)
        Image("$image",Modifier.height(300.dp))
        Text("$comment", fontSize = 20.sp)
    }
}