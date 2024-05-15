package com.ti2a.kel3.guessup.data

import com.ti2a.kel3.guessup.R

data class QuizItem(
    val imageRes: Int,
    val answer: String
)

object QuizRepository {
    val animalQuizList = listOf(
        QuizItem(R.drawable.cat, "kucing"),
        // Tambahkan soal tebakan binatang lainnya
    )

    val fruitQuizList = listOf(
        QuizItem(R.drawable.avocado, "alpukat"),
        // Tambahkan soal tebakan buah lainnya
    )
}