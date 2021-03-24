package pl.zdajegzamin.driverswebsite.dto;

import lombok.Data;

@Data
public class AnswerDTO {
    private Long answerID;
    private Long quizID;
    private Long adviceID;
    private Long questionID;
}
