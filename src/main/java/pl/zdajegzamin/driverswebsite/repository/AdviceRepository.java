package pl.zdajegzamin.driverswebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zdajegzamin.driverswebsite.entity.Advice;

@Repository
public interface AdviceRepository extends JpaRepository<Advice,Long> {

}
