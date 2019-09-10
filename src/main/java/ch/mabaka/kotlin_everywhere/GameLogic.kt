package ch.mabaka.kotlin_everywhere

import java.util.*

class GameLogic {

    fun computerDraw(): Choice {
        val choices = Choice.values()
        // in Kotlin 1.3 this would be `choices.random()`
        return choices[Random().nextInt(choices.size)]
    }
}