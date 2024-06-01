package com.ti2a.kel3.guessup.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ti2a.kel3.guessup.ui.components.GButton
import com.ti2a.kel3.guessup.ui.components.GuessLogo
import com.ti2a.kel3.guessup.ui.theme.GuessUpTheme

@Composable
fun QuizCategoryScreen(modifier: Modifier = Modifier, navigateQuiz: (String) -> Unit) {
    Column(
        modifier = modifier ?: Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GuessLogo()
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            GButton(text = "Binatang", modifier = Modifier.width(160.dp)) {
                navigateQuiz("animal")
            }
            Spacer(modifier = Modifier.size(10.dp))
            GButton(text = "Buah", modifier = Modifier.width(160.dp)) {
                navigateQuiz("fruit")
            }
        }

    }
}

@Preview
@Composable
fun QuizCategoryScreenPreview() {
    GuessUpTheme {
        QuizCategoryScreen() {

        }
    }
}