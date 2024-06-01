package com.ti2a.kel3.guessup.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ti2a.kel3.guessup.R
import com.ti2a.kel3.guessup.ui.theme.GuessUpTheme

@Composable
fun GuessLogo(modifier: Modifier = Modifier) {
    Spacer(modifier = Modifier.size(12.dp))
    Image(
        painter = painterResource(id = R.drawable.guess_up),
        contentDescription = null,
        modifier = modifier
        )
}

@Preview
@Composable
fun GuessLogoPreview() {
    GuessUpTheme {
        GuessLogo()
    }
}