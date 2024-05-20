package com.ti2a.kel3.guessup.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ti2a.kel3.guessup.R
import com.ti2a.kel3.guessup.data.QuizItem
import com.ti2a.kel3.guessup.ui.components.GuessLogo
import com.ti2a.kel3.guessup.ui.theme.GuessUpTheme
import com.ti2a.kel3.guessup.ui.theme.Pink40

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    navigateQuiz: (String) -> Unit
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        GuessLogo()
        Text(text = "Apakah kamu bisa menebakku?",
            fontSize = 22.sp,
            color = Color.White
        )
        Image(
            painter = painterResource(R.drawable.think),
            contentDescription = null,
//            modifier = Modifier.
        )
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = { navigateQuiz("animal") },
            modifier = Modifier
                .width(120.dp),
            colors = ButtonDefaults.buttonColors(Pink40)
        ) {
            Text(text = "Mainkan")
        }
    }
}