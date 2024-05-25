package com.ti2a.kel3.guessup.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ti2a.kel3.guessup.ui.theme.GuessUpTheme
import com.ti2a.kel3.guessup.ui.theme.Purple80

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun QuizTextField(count: Int, answerState: List<MutableState<TextFieldValue>>) {
    val focusRequesters = remember { List(count) { FocusRequester() } }
    val focusManager = LocalFocusManager.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
    ) {
        repeat(count) { i ->
            BasicTextField(
                value = answerState[i].value,
                onValueChange = {
                    if (it.text.length <= 1) {
                        answerState[i].value = it
//                        if (it.text.isNotEmpty()) {
//                            if (i < count - 1) focusRequesters[i + 1].requestFocus()
//                            else focusManager.clearFocus()
//                        }
                    }
                },
                decorationBox = { innerTextField ->
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .background(Color.Gray)
                            .padding(8.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        if (answerState[i].value.text.isEmpty()) {
                            Text(
                                text = "",
                                color = Color.LightGray,
                                fontSize = 32.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                        innerTextField()
                    }
                },
                modifier = Modifier
                    .padding(4.dp)
                    .weight(1f)
                    .size(48.dp)
                    .focusRequester(focusRequesters[i]),
            )
        }
    }

    LaunchedEffect(Unit) {
        focusRequesters.first().requestFocus()
    }
}

@Preview
@Composable
fun QuizTextFieldPreview() {
    val quizState = remember { List(7) { mutableStateOf(TextFieldValue("")) } }
    GuessUpTheme {
        QuizTextField(count = 7, quizState)
    }
}