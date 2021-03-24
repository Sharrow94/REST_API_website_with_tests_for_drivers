package pl.zdajegzamin.driverswebsite.service;

import pl.zdajegzamin.driverswebsite.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void delete(Long id);
    List<User>findAll();
    User findById(Long id);
}
