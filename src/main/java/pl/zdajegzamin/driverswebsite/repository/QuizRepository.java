package pl.zdajegzamin.driverswebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zdajegzamin.driverswebsite.entity.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz,Long> {
}
