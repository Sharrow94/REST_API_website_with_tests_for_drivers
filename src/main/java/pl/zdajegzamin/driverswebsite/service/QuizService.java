package pl.zdajegzamin.driverswebsite.service;

import pl.zdajegzamin.driverswebsite.entity.Quiz;
import java.util.List;

public interface QuizService {

    Quiz findById(Long id);
    void save(Quiz quiz);
    void deleteById(Long id);
    List<Quiz> findAll();
}
