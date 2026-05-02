package com.example.myapplication.ui.components.footer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Footer(
    autor: String,
    ano: Int
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp) .navigationBarsPadding(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "© $ano - Criado por $autor",
            fontSize = 12.sp
        )
    }
}