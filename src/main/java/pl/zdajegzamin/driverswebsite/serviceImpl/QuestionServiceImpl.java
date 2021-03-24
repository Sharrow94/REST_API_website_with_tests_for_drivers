package pl.zdajegzamin.driverswebsite.serviceImpl;

import org.springframework.stereotype.Service;
import pl.zdajegzamin.driverswebsite.entity.Question;
import pl.zdajegzamin.driverswebsite.repository.QuestionRepository;
import pl.zdajegzamin.driverswebsite.service.QuestionService;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public void save(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void delete(Long id) {
        questionRepository.deleteById(id);
    }

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question findById(Long id) {
        return questionRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("There is no entity with id: "+id));
    }

    @Override
    public List<Question> findAllCurrentQuestionsForAdvice(Long id) {
        return questionRepository.findAllCurrentQuestionsForAdvice(id);
    }

    @Override
    public boolean checkAnswerForQuestion(Long questionId, Long userAnswerId) {
        return questionRepository.getCorrectAnswerForQuestion(questionId).equals(userAnswerId);
    }
}
