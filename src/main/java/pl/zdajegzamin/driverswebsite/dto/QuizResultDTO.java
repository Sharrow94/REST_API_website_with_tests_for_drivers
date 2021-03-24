package pl.zdajegzamin.driverswebsite.dto;

import lombok.Data;
import java.util.List;

@Data
public class QuizResultDTO {
    private Long adviceID;
    private Long userID;
    private Long quizID;
    private List<AnswerDTO> markedAnswers;
}
