package pl.zdajegzamin.driverswebsite.service;

import pl.zdajegzamin.driverswebsite.entity.Question;

import java.util.List;

public interface QuestionService {

    void save(Question question);
    void delete(Long id);
    List<Question> findAll();
    Question findById(Long id);
    List<Question>findAllCurrentQuestionsForAdvice(Long id);
    boolean checkAnswerForQuestion(Long questionId,Long userAnswerId);

}
