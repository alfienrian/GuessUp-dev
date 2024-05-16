package com.ti2a.kel3.guessup.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ti2a.kel3.guessup.R

@Composable
fun GuessLogo(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.guess_up),
        contentDescription = null,
//        modifier = Modifier.width(200.dp)
        )
}