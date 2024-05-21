package com.example.baseball.domain.contracts

interface GamePlayContract {

    interface View {
        fun showLife(life: Int)
        fun showGameStatus(strike: Int, ball: Int)
        fun showGameResult(ameResult: String, answer: List<Int>)
    }

    interface Presenter {
        fun decreaseLife()
        fun playgame(playerNumber: List<Int>)
        fun playHandler(computer: List<Int>, player: List<Int>)
        fun checkNumber(answer: List<Int>): List<Int>
    }
}