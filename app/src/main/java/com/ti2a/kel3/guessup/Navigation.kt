package com.ti2a.kel3.guessup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ti2a.kel3.guessup.data.QuizRepository
import com.ti2a.kel3.guessup.ui.screens.MainScreen
import com.ti2a.kel3.guessup.ui.screens.QuizCategoryScreen
import com.ti2a.kel3.guessup.ui.screens.QuizScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            MainScreen {
                navController.navigate("category")
            }
        }
        composable("category") {
            QuizCategoryScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(R.color.purple_700))
            ) { category ->
                when (category) {
                    "animal" -> navController.navigate("quiz/animal")
                    "fruit" -> navController.navigate("quiz/fruit")
                }
            }
        }
        composable("quiz/animal") {
            QuizScreen(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(R.color.purple_700)),
                quizList = QuizRepository.animalQuizList)
        }
        composable("quiz/fruit") {
            QuizScreen(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(R.color.purple_700)),
                quizList = QuizRepository.fruitQuizList)
        }
    }
}