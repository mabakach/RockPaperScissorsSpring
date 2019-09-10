package ch.mabaka.kotlin_everywhere;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GameRepository extends CrudRepository<Game, Integer> {
    @Query("select sum(g.computerScore) from Game g")
    Optional<Long> computerScoreTotal();

    @Query("select sum(g.userScore) from Game g")
    Optional<Long> userScoreTotal();
}