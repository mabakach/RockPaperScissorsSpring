package ch.mabaka.kotlin_everywhere;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Game {
    @Id
    @GeneratedValue
    private Long id;
    private Choice userChoice;
    private Choice computerChoice;
    private Long userScore;
    private Long computerScore;

    public Game() {
    }

    public Game(
            @NotNull Long id,
            @NotNull Choice userChoice,
            @NotNull Choice computerChoice,
            @NotNull Long userScore,
            @NotNull Long computerScore) {
        this.id = id;
        this.userChoice = userChoice;
        this.computerChoice = computerChoice;
        this.userScore = userScore;
        this.computerScore = computerScore;
    }

    public Long getId() {
        return id;
    }

    public Choice getUserChoice() {
        return userChoice;
    }

    public Choice getComputerChoice() {
        return computerChoice;
    }

    public Long getUserScore() {
        return userScore;
    }

    public Long getComputerScore() {
        return computerScore;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", userChoice='" + userChoice + '\'' +
                ", computerChoice='" + computerChoice + '\'' +
                ", userScore=" + userScore +
                ", computerScore=" + computerScore +
                '}';
    }
}
