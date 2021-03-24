package pl.zdajegzamin.driverswebsite.serviceImpl;

import org.springframework.stereotype.Service;
import pl.zdajegzamin.driverswebsite.dto.AnswerDTO;
import pl.zdajegzamin.driverswebsite.dto.QuizResultDTO;
import pl.zdajegzamin.driverswebsite.entity.Score;
import pl.zdajegzamin.driverswebsite.service.QuestionService;
import pl.zdajegzamin.driverswebsite.service.QuizService;
import pl.zdajegzamin.driverswebsite.service.ScoreService;
import pl.zdajegzamin.driverswebsite.service.UserService;

import java.util.List;


@Service
public class QuizResultService {

    private final QuestionService questionService;
    private final ScoreService scoreService;
    private final UserService userService;
    private final QuizService quizService;

    public QuizResultService(QuestionService questionService, ScoreService scoreService, UserService userService, QuizService quizService) {
        this.questionService = questionService;
        this.scoreService = scoreService;
        this.userService = userService;
        this.quizService = quizService;
    }

    public void save(QuizResultDTO quizResultDTO){
        List<AnswerDTO>userAnswers=quizResultDTO.getMarkedAnswers();
        if (userAnswers != null) {
            int points = (int) userAnswers.stream().filter(userAnswer -> questionService.checkAnswerForQuestion(userAnswer.getQuestionID(), userAnswer.getAnswerID())).count();
            System.out.println("work");
            Score score = new Score();
            score.setUser(userService.findById(quizResultDTO.getUserID()));
            score.setPoints(points);
            score.setQuiz(quizService.findById(quizResultDTO.getQuizID()));
            scoreService.saveScore(score);
        }else System.out.println("prawie działa");
    }
}
