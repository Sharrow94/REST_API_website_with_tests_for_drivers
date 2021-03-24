package pl.zdajegzamin.driverswebsite.controller;

import org.springframework.web.bind.annotation.*;
import pl.zdajegzamin.driverswebsite.converter.ScoreConverter;
import pl.zdajegzamin.driverswebsite.dto.QuizResultDTO;
import pl.zdajegzamin.driverswebsite.dto.ScoreDTO;
import pl.zdajegzamin.driverswebsite.service.ScoreService;
import pl.zdajegzamin.driverswebsite.serviceImpl.QuizResultService;

import java.util.List;

@RestController
@RequestMapping("/api/score")
public class ScoreController {

    private final ScoreService scoreService;
    private final ScoreConverter scoreConverter;
    private final QuizResultService quizResultService;

    public ScoreController(ScoreService scoreService, ScoreConverter scoreConverter, QuizResultService quizResultService) {
        this.scoreService = scoreService;
        this.scoreConverter = scoreConverter;

        this.quizResultService = quizResultService;
    }

    @PostMapping("/new")
    public void saveScore(@RequestBody QuizResultDTO quizResultDTO){
        quizResultService.save(quizResultDTO);
    }

    @GetMapping("/list")
    public List<ScoreDTO> showScores(){
        return scoreConverter.entityToDto(scoreService.findAll());
    }
}
