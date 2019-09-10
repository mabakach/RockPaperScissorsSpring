package ch.mabaka.kotlin_everywhere

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotNull

@Entity
class Game {
    @Id
    @GeneratedValue
    val id: Long?
    val userChoice: Choice
    val computerChoice: Choice
    val userScore: Long?
    val computerScore: Long?


    constructor(
            @NotNull id: Long?,
            @NotNull userChoice: Choice,
            @NotNull computerChoice: Choice,
            @NotNull userScore: Long?,
            @NotNull computerScore: Long?) {
        this.id = id
        this.userChoice = userChoice
        this.computerChoice = computerChoice
        this.userScore = userScore
        this.computerScore = computerScore
    }

    override fun toString(): String {
        return "Game{" +
                "id=" + id +
                ", userChoice='" + userChoice + '\''.toString() +
                ", computerChoice='" + computerChoice + '\''.toString() +
                ", userScore=" + userScore +
                ", computerScore=" + computerScore +
                '}'.toString()
    }
}
