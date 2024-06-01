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
        QuizItem(R.drawable.badak, "badak"),
        QuizItem(R.drawable.bebek, "bebek"),
        QuizItem(R.drawable.buaya, "buaya"),
        QuizItem(R.drawable.gajah, "gajah"),
        QuizItem(R.drawable.anjing, "anjing"),
        QuizItem(R.drawable.ayam, "ayam"),
        QuizItem(R.drawable.ikan, "ikan"),
        QuizItem(R.drawable.kambing, "kambing"),
        QuizItem(R.drawable.kelinci, "kelinci"),
        QuizItem(R.drawable.jerapah, "jerapah"),
        QuizItem(R.drawable.kuda, "kuda"),
        QuizItem(R.drawable.kumbang, "kumbang"),
        QuizItem(R.drawable.singa, "singa"),
        QuizItem(R.drawable.penyu, "penyu"),
        QuizItem(R.drawable.zebra, "zebra"),
        QuizItem(R.drawable.panda, "panda"),
        QuizItem(R.drawable.sapi, "sapi"),
        QuizItem(R.drawable.sipuuut, "siput"),
        QuizItem(R.drawable.snake, "ular"),
    )

    val fruitQuizList = listOf(
        QuizItem(R.drawable.avocado, "alpukat"),
        // Tambahkan soal tebakan buah lainnya
    )

    fun getRandomAnimals(): List<QuizItem> {
        return animalQuizList.shuffled().take(5)
    }

    fun getRandomFruits(): List<QuizItem> {
        return fruitQuizList.shuffled().take(5)
    }
}