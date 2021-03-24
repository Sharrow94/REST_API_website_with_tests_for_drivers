package pl.zdajegzamin.driverswebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zdajegzamin.driverswebsite.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
