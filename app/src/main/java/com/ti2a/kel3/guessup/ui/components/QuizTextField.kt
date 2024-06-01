package com.ti2a.kel3.guessup.ui.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ti2a.kel3.guessup.ui.theme.GuessUpTheme
import com.ti2a.kel3.guessup.ui.theme.Pink40
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun QuizTextField(answer: String, onAnswerChanged: (String) -> Unit) {
    val count = answer.length
    val focusRequesters = remember(count) { List(count) { FocusRequester() } }
    val focusManager = LocalFocusManager.current
    val answerState = remember(count) { List(count) { mutableStateOf("") } }

    val scrollState = rememberScrollState()
    val coroutineScope = rememberCoroutineScope()

    // hapus semua input pada saat jawaban benar berubah
    DisposableEffect(answer) {
        onDispose {
            answerState.forEach { it.value = "" }
        }
    }

    // untuk keperluan debugging
    Log.d("DEBUGQUIZ", count.toString())
    Log.d("DEBUGQUIZ", answerState.size.toString())

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .verticalScroll(scrollState)
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            repeat(count) { i ->
                BasicTextField(
                    value = answerState[i].value,
                    onValueChange = { it ->
                        if (it.length <= 1) {
                            answerState[i].value = it.uppercase()
                            val newAnswer = answerState.joinToString(separator = "") { it.value }
                            onAnswerChanged(newAnswer)

                            val allInputsFilled = answerState.all { state ->
                                state.value.isNotEmpty()
                            }
                            if (allInputsFilled) return@BasicTextField focusManager.clearFocus()

                            when {
                                // Move focus to the next input if user typed a character and it's not the last input
                                it.isNotEmpty() && i < count - 1 -> {
                                    focusRequesters[i + 1].requestFocus()
                                }
                                // Move focus to the previous input if user deleted a character and it's not the first input
                                it.isEmpty() && i > 0 -> {
                                    focusRequesters[i - 1].requestFocus()
                                }
                            }
                        }
                    },
                    textStyle = TextStyle(
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                        fontSize = 32.sp
                    ),
                    modifier = Modifier
                        .padding(4.dp)
                        .weight(1f)
                        .size(42.dp)
                        .background(Pink40)
                        .focusRequester(focusRequesters[i])
                        .onFocusChanged { focusState ->
                            if (focusState.isFocused) {
                                coroutineScope.launch {
                                    // Small delay to ensure the element is focused before scrolling
                                    delay(100)
                                    scrollState.animateScrollTo(i * 200) // Adjust this multiplier as needed
                                }
                            }
                        },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = if (i == count - 1) ImeAction.Done else ImeAction.Next
                    ),
                    keyboardActions = KeyboardActions(
                        onNext = {
                            if (i < count - 1) {
                                focusRequesters[i + 1].requestFocus()
                            }
                        },
                        onDone = {
                            if (i == count - 1) {
                                focusManager.clearFocus()
                            }
                        }
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun QuizTextFieldPreview() {
    var answer = "";
    GuessUpTheme {
        QuizTextField("test") {
            answer = it
        }
    }
}