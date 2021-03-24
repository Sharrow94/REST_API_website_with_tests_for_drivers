package pl.zdajegzamin.driverswebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zdajegzamin.driverswebsite.entity.Score;

@Repository
public interface ScoreRepository extends JpaRepository<Score,Long> {
}
