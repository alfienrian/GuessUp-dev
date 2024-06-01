package com.ti2a.kel3.guessup.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import com.ti2a.kel3.guessup.ui.components.GButton
import com.ti2a.kel3.guessup.ui.theme.GuessUpTheme
import com.ti2a.kel3.guessup.ui.theme.Purple80

@Composable
fun ResultScreen(
    result: String?,
    modifier: Modifier = Modifier,
    navigateScreen: (String) -> Unit
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.guess_up),
            contentDescription = null,
            modifier = Modifier.width(300.dp)
        )
        Text(
            text = "Selamat! Poin kamu adalah",
            color = Color.White,
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.size(22.dp))
        Box(contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(id = R.drawable.circle),
                contentDescription = null,
                modifier = Modifier.size(320.dp)
            )
            Text(
                text = result.toString(),
                fontSize = 96.sp,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.size(22.dp))
        GButton(text = "Kembali") {
            navigateScreen("main")
        }
    }
}

@Preview
@Composable
fun ResultScreenPreview() {
    GuessUpTheme {
        ResultScreen(
            result = "80",
            modifier = Modifier
                .background(Purple80)
                .fillMaxSize()
        ) {

        }
    }
}