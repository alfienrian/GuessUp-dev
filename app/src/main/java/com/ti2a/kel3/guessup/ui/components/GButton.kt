package com.ti2a.kel3.guessup.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ti2a.kel3.guessup.ui.theme.Pink40

@Composable
fun GButton(
    text: String,
    modifier: Modifier = Modifier,
    textModifier: Modifier = Modifier,
    roundedCorner: RoundedCornerShape = RoundedCornerShape(12.dp),
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = roundedCorner,
        colors = ButtonDefaults.buttonColors(Pink40),
        contentPadding = PaddingValues(horizontal = 28.dp, vertical=12.dp)
    ) {
        Text(
            text = text,
            modifier = textModifier
        )
    }
}