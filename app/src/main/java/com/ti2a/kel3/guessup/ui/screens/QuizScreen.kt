package com.ti2a.kel3.guessup.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ti2a.kel3.guessup.data.QuizItem
import com.ti2a.kel3.guessup.ui.components.GButton
import com.ti2a.kel3.guessup.ui.components.GuessLogo
import com.ti2a.kel3.guessup.ui.components.QuizTextField
import com.ti2a.kel3.guessup.ui.theme.Pink80

@Composable
fun QuizScreen(
    modifier: Modifier = Modifier,
    quizList: List<QuizItem>,
    category: String,
    navigateScreen: (String) -> Unit,
) {
    var progress by remember { mutableIntStateOf(1) }
    var isCorrect by remember { mutableStateOf(false) }
    var currentQuestionIndex by remember { mutableIntStateOf(0) }
    var answer by remember { mutableStateOf("") }
    var quizMessage by remember { mutableStateOf("Apakah aku?") }

    Column(
        modifier = modifier
    ) {
        GuessLogo(
            modifier = Modifier
                .align(Alignment.End)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "$progress/${quizList.size}")
            Spacer(modifier = Modifier.size(12.dp))
            Text(
                text = category,
                modifier = Modifier
                    .background(Pink80)
                    .padding(horizontal = 12.dp, vertical = 4.dp)
            )
            Spacer(modifier = Modifier.size(22.dp))
            Text(
                text = quizMessage,
                color = Color.White,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.size(60.dp))
            Image(
                painter = painterResource(id = quizList[currentQuestionIndex].image),
                contentDescription = null
            )
            QuizTextField(count = quizList.size, text = answer)

            if (!isCorrect) {
                GButton(text = "Cek") {
                    isCorrect = answer == quizList[currentQuestionIndex].answer
                    quizMessage = when (isCorrect) {
                        true -> "JAWABAN BENAR"
                        false -> "Yahh Jawaban Kamu Kurang Tepat"
                    }
                }
            } else {
                GButton(text = "Selanjutnya") {
                    if (progress == quizList.size) {
                        navigateScreen("result")
                    }
                    currentQuestionIndex++
                    progress++
                    isCorrect = false
                }
            }
        }
    }
}

//@Preview
//@Composable
//fun QuizScreenPreview() {
//    GuessUpTheme {
//        QuizScreen()
//    }
//}