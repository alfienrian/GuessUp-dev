package com.ti2a.kel3.guessup.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ti2a.kel3.guessup.R
import com.ti2a.kel3.guessup.data.QuizItem
import com.ti2a.kel3.guessup.ui.components.GuessLogo
import com.ti2a.kel3.guessup.ui.components.QuizTextField
import com.ti2a.kel3.guessup.ui.theme.GuessUpTheme
import com.ti2a.kel3.guessup.ui.theme.Pink40
import com.ti2a.kel3.guessup.ui.theme.Pink80

@Composable
fun QuizScreen(
    modifier: Modifier = Modifier,
    quizList: List<QuizItem>
) {
    Column(
        modifier = modifier
    ) {
        GuessLogo(modifier = Modifier
            .align(Alignment.End)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
            ) {
            Text(
                text = "Binatang",
                modifier = Modifier
                    .background(Pink80)
                    .padding(horizontal = 12.dp, vertical = 4.dp)
            )
            Spacer(modifier = Modifier.size(22.dp))
            Text(
                text = "Apakah aku?",
                color = Color.White,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.size(60.dp))
            Row {
                repeat(7) {
//                    BasicTextField() {
//
//                    }
                }
            }
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(12.dp),
                contentPadding = PaddingValues(horizontal = 40.dp)
            ) {
                Text(text = "Cek")
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