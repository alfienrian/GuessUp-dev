package com.ti2a.kel3.guessup.data

import com.ti2a.kel3.guessup.R

data class QuizItem(
    val image: Int,
    val answer: String
)

object QuizRepository {
    val animalQuizList = listOf(
        QuizItem(R.drawable.cat, "kucing"),
        QuizItem(R.drawable.belalang, "belalang"),
        // TODO: Mengganti semua data gambar
        QuizItem(R.drawable.badak, "badak"),
        QuizItem(R.drawable.bebek, "bebek"),
//        QuizItem(R.drawable.cat, "harimau"),
        QuizItem(R.drawable.buaya, "buaya"),
        QuizItem(R.drawable.gajah, "gajah"),
    )

    val fruitQuizList = listOf(
        QuizItem(R.drawable.avocado, "alpukat"),
        // Tambahkan soal tebakan buah lainnya
    )
}