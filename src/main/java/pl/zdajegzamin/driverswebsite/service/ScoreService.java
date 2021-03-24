package pl.zdajegzamin.driverswebsite.service;

import pl.zdajegzamin.driverswebsite.entity.Score;
import java.util.List;

public interface ScoreService {
    void saveScore(Score score);
    List<Score> findAll();
}
