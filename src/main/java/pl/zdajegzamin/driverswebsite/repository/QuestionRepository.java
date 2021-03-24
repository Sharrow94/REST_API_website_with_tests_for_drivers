package pl.zdajegzamin.driverswebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.zdajegzamin.driverswebsite.entity.Question;
import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {


    @Query(value = "select a.currentQuiz.questions from Advice a where a.id=?1")
    List<Question> findAllCurrentQuestionsForAdvice(Long id);
    @Query(value = "select q.correctAnswer.id from Question q where q.id=?1")
    Long getCorrectAnswerForQuestion(Long id);
}
