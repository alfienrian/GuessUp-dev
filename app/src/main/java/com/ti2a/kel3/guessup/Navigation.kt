package com.ti2a.kel3.guessup

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ti2a.kel3.guessup.data.QuizRepository
import com.ti2a.kel3.guessup.ui.screens.QuizCategoryScreen
import com.ti2a.kel3.guessup.ui.screens.QuizScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            QuizCategoryScreen { category ->
                when (category) {
                    "animal" -> navController.navigate("quiz/animal")
                    "fruit" -> navController.navigate("quiz/fruit")
                }
            }
        }
        composable("quiz/animal") {
            QuizScreen(quizList = QuizRepository.animalQuizList)
        }
        composable("quiz/fruit") {
            QuizScreen(quizList = QuizRepository.fruitQuizList)
        }
    }
}