package pl.zdajegzamin.driverswebsite.serviceImpl;

import org.springframework.stereotype.Service;
import pl.zdajegzamin.driverswebsite.entity.Score;
import pl.zdajegzamin.driverswebsite.repository.ScoreRepository;
import pl.zdajegzamin.driverswebsite.service.ScoreService;
import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {

    private final ScoreRepository scoreRepository;

    public ScoreServiceImpl(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    @Override
    public void saveScore(Score score) {
        scoreRepository.save(score);
    }

    @Override
    public List<Score> findAll() {
        return scoreRepository.findAll();
    }
}
