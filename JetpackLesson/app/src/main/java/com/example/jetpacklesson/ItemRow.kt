package com.example.jetpacklesson

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.unit.dp

@Composable
fun ItemRow (item: ItemRowModel){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(color = White)
            .padding(3.dp)
    ){  }
}