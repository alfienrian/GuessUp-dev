package com.ti2a.kel3.guessup.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun QuizTextField(answer: String, onAnswerChange: (String) -> Unit) {
    OutlinedTextField(
        value = answer,
        onValueChange = onAnswerChange,
        modifier = Modifier.fillMaxWidth()
    )
}