package pl.zdajegzamin.driverswebsite.service;

import pl.zdajegzamin.driverswebsite.entity.Advice;
import java.util.List;

public interface AdviceService {

    Advice findById(Long id);
    void save(Advice advice);
    void deleteById(Long id);
    List<Advice> findAll();
}
