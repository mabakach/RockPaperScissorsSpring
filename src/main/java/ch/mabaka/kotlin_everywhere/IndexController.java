package ch.mabaka.kotlin_everywhere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class IndexController {
    private GameRepository gameRepository;

    public IndexController(@Autowired GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @GetMapping
    public ModelAndView index(Map<String, Object> model) {
        model.put("entries", gameRepository.findAll());
        model.put("computerScoreTotal", gameRepository.computerScoreTotal().orElse(0L));
        model.put("userScoreTotal", gameRepository.userScoreTotal().orElse(0L));

        return new ModelAndView("index", model); // because `index.mustache`
    }


    @PostMapping
    public String play(@RequestParam Choice userChoice) {
        // this is a mock implementation for now
        GameLogic gameLogic = new GameLogic();
        Choice computerChoice = gameLogic.computerDraw();
        Game g = new Game(null, userChoice, computerChoice, 0L, 0L); gameRepository.save(g);
        return "redirect:/"; // redirect to `/`//
    }
}
