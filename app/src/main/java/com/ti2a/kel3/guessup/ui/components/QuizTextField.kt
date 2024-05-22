package com.ti2a.kel3.guessup.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ti2a.kel3.guessup.ui.theme.Purple80

@Composable
fun QuizTextField(text: String, count: Int) {
    var value = ""

    BasicTextField(
        value = value,
        onValueChange = {
            if (it.length <= 1) value = it
        },
        textStyle = TextStyle(color = Color.Black),
        modifier = Modifier.padding(8.dp),
        decorationBox = {
            Row(horizontalArrangement = Arrangement.Center) {
                repeat(count) { index ->
                    CharView(
                        index = index,
                        text = value
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }
        }
    )
}

@Composable
private fun CharView(
    index: Int,
    text: String
) {
    val isFocused = text.length == index
    val char = when {
        index > text.length -> ""
        else -> text[index].toString()
    }
    Text(
        modifier = Modifier
            .width(40.dp)
            .padding(2.dp)
            .border(
                width = 1.dp,
                color = when {
                    isFocused -> Purple80
                    else -> Color.Gray
                },
                shape = RoundedCornerShape(8.dp)
            ),
        text = char,
        style = MaterialTheme.typography.labelMedium,
        textAlign = TextAlign.Center
    )
}