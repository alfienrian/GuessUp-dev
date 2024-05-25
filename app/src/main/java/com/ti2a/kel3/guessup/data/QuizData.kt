package com.ti2a.kel3.guessup.data

import com.ti2a.kel3.guessup.R

data class QuizItem(
    val image: Int,
    val answer: String
)

object QuizRepository {
    val animalQuizList = listOf(
        QuizItem(R.drawable.cat, "kucing"),
        // TODO: Mengganti semua data gambar
        QuizItem(R.drawable.cat, "badak"),
        QuizItem(R.drawable.cat, "burung"),
//        QuizItem(R.drawable.cat, "harimau"),
        QuizItem(R.drawable.cat, "sapi"),
        QuizItem(R.drawable.cat, "anjing"),
        QuizItem(R.drawable.cat, "kambing"),
    )

    val fruitQuizList = listOf(
        QuizItem(R.drawable.avocado, "alpukat"),
        // Tambahkan soal tebakan buah lainnya
    )
}