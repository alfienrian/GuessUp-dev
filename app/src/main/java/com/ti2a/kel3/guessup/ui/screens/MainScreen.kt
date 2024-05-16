package com.ti2a.kel3.guessup.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ti2a.kel3.guessup.R
import com.ti2a.kel3.guessup.data.QuizItem
import com.ti2a.kel3.guessup.ui.components.GuessLogo

@Composable
fun MainScreen(modifier: Modifier = Modifier, navigateQuiz: (String) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        GuessLogo()
        Text(text = "Apakah kamu bisa menebakku")
        Image(
            painter = painterResource(R.drawable.think),
            contentDescription = null,
//            modifier = Modifier.
        )
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = { navigateQuiz("animal") },
            modifier = Modifier
                .width(120.dp)
        ) {
            Text(text = "Mainkan")
        }
    }
}