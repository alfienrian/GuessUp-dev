package com.ti2a.kel3.guessup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ti2a.kel3.guessup.data.QuizRepository
import com.ti2a.kel3.guessup.ui.screens.MainScreen
import com.ti2a.kel3.guessup.ui.screens.QuizCategoryScreen
import com.ti2a.kel3.guessup.ui.screens.QuizScreen
import com.ti2a.kel3.guessup.ui.screens.ResultScreen
import com.ti2a.kel3.guessup.ui.theme.Purple80

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            MainScreen(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Purple80)
                    .fillMaxSize()
            ) {
                navController.navigate("category")
            }
        }
        composable("category") {
            QuizCategoryScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Purple80)
            ) { category ->
                when (category) {
                    "animal" -> navController.navigate("quiz/animal")
                    "fruit" -> navController.navigate("quiz/fruit")
                }
            }
        }
        composable("result/{score}") {
            val score = it.arguments?.getString("score")
            ResultScreen(
                result = score,
                modifier = Modifier
                    .background(Purple80)
                    .fillMaxSize()
                ) { route ->
                navController.navigate(route)
            }
        }
        composable("quiz/animal") {
            QuizScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Purple80),
                quizList = QuizRepository.getRandomAnimals(),
                category = "Binatang"
            ) { route ->
                navController.navigate(route)
            }
        }
        composable("quiz/fruit") {
            QuizScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Purple80),
                quizList = QuizRepository.getRandomFruits(),
                category = "Buah"
            ) { route ->
                navController.navigate(route)
            }
        }
    }
}