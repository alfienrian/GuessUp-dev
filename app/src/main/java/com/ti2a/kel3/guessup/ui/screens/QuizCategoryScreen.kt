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
import com.ti2a.kel3.guessup.ui.components.GButton
import com.ti2a.kel3.guessup.ui.components.GuessLogo

@Composable
fun QuizCategoryScreen(modifier: Modifier = Modifier, navigateQuiz: (String) -> Unit) {
    Column(
        modifier = modifier ?: Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GuessLogo()
        Column(verticalArrangement = Arrangement.Center) {
            GButton(text = "Binatang") {
                navigateQuiz("animal")
            }
            GButton(text = "Buah") {
                navigateQuiz("fruit")
            }
        }

    }
}