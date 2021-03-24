package pl.zdajegzamin.driverswebsite.controller;

import org.springframework.web.bind.annotation.*;
import pl.zdajegzamin.driverswebsite.converter.AdviceConverter;
import pl.zdajegzamin.driverswebsite.dto.AdviceDTO;
import pl.zdajegzamin.driverswebsite.entity.Question;
import pl.zdajegzamin.driverswebsite.service.AdviceService;
import pl.zdajegzamin.driverswebsite.service.QuestionService;

import java.util.List;


@RestController
@RequestMapping("/api/advice")
public class AdviceController {

    private final AdviceService adviceService;
    private final AdviceConverter adviceConverter;
    private final QuestionService questionService;

    public AdviceController(AdviceService adviceService, AdviceConverter adviceConverter, QuestionService questionService) {
        this.adviceService = adviceService;
        this.adviceConverter = adviceConverter;
        this.questionService = questionService;
    }

    @GetMapping("/list")
    public List<AdviceDTO> showHomePage(){
        return adviceConverter.entityToDto(adviceService.findAll());
    }

    @GetMapping("/questions/{id}")
    public List<Question> showAdvice(@PathVariable("id")Long id){
        return questionService.findAllCurrentQuestionsForAdvice(id);
    }
}
