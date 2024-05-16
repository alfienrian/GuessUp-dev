package com.ti2a.kel3.guessup.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ti2a.kel3.guessup.ui.components.GuessLogo

@Composable
fun QuizCategoryScreen(modifier: Modifier = Modifier,navigateQuiz: (String) -> Unit) {
    Column(
        modifier = modifier ?: Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GuessLogo()
        Button(onClick = { navigateQuiz("animal") },
            modifier = Modifier
                .width(120.dp)
        ) {
            Text(text = "Binatang")
        }
        Button(onClick = { navigateQuiz("fruit") },
            modifier = Modifier
                .width(120.dp)) {
            Text(text = "Buah")
        }
    }
}