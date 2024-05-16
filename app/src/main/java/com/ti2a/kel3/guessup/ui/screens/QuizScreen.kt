package com.ti2a.kel3.guessup.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.ti2a.kel3.guessup.R
import com.ti2a.kel3.guessup.data.QuizItem
import com.ti2a.kel3.guessup.ui.components.QuizTextField

@Composable
fun QuizScreen(modifier: Modifier = Modifier, quizList: List<QuizItem>) {
    Column(
        modifier = modifier
    ) {
//        Image(painter = painterResource(id = List), contentDescription = )
        Text(text = "Apakah aku?")
    }
}