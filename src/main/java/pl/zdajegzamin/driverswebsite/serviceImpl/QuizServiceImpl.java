package pl.zdajegzamin.driverswebsite.serviceImpl;

import org.springframework.stereotype.Service;
import pl.zdajegzamin.driverswebsite.entity.Quiz;
import pl.zdajegzamin.driverswebsite.repository.QuizRepository;
import pl.zdajegzamin.driverswebsite.service.QuizService;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;

    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public Quiz findById(Long id) {
        return quizRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("There is no entity with id: "+id));
    }

    @Override
    public void save(Quiz quiz) {
        quizRepository.save(quiz);
    }

    @Override
    public void deleteById(Long id) {
        quizRepository.deleteById(id);
    }

    @Override
    public List<Quiz> findAll() {
        return quizRepository.findAll();
    }
}
