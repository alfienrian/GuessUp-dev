package com.ti2a.kel3.guessup.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ti2a.kel3.guessup.R

@Composable
fun ResultScreen(result: Int, modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(R.drawable.guess_up),
            contentDescription = null,
            modifier = Modifier.width(300.dp)
        )
        Spacer(modifier = Modifier.height(200.dp))
        Text(
            text = "Selamat! Poin kamu adalah $result",
            color = Color.Black,
        )

    }
}