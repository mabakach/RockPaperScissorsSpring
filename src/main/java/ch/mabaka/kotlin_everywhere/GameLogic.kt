package ch.mabaka.kotlin_everywhere

import java.util.*

class GameLogic {
    fun computerDraw(): Choice {
        val choices = Choice.values()
        // in Kotlin 1.3 this would be `choices.random()`
        return choices[Random().nextInt(choices.size)]
    }

    fun referee(userChoice: Choice, computerChoice: Choice): Winner {
        return when (userChoice) {
            Choice.Rock -> rockGiven(computerChoice)
            Choice.Paper -> paperGiven(computerChoice)
            Choice.Scissors -> scissorsGiven(computerChoice)
        }
    }

    private fun rockGiven(computerChoice: Choice): Winner {
        return when (computerChoice) {
            Choice.Rock -> Winner.NoOne
            Choice.Paper -> Winner.Computer
            Choice.Scissors -> Winner.Player
        }
    }

    private fun paperGiven(computerChoice: Choice): Winner {
        return when (computerChoice) {
            Choice.Rock -> Winner.Player
            Choice.Paper -> Winner.NoOne
            Choice.Scissors -> Winner.Computer
        }
    }

    private fun scissorsGiven(computerChoice: Choice): Winner {
        return when (computerChoice) {
            Choice.Rock -> Winner.Computer
            Choice.Paper -> Winner.Player
            Choice.Scissors -> Winner.NoOne
        }
    }
}