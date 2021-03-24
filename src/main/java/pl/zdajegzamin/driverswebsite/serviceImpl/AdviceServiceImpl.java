package pl.zdajegzamin.driverswebsite.serviceImpl;

import org.springframework.stereotype.Service;
import pl.zdajegzamin.driverswebsite.entity.Advice;
import pl.zdajegzamin.driverswebsite.repository.AdviceRepository;
import pl.zdajegzamin.driverswebsite.service.AdviceService;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class AdviceServiceImpl implements AdviceService {

    private final AdviceRepository adviceRepository;

    public AdviceServiceImpl(AdviceRepository adviceRepository) {
        this.adviceRepository = adviceRepository;
    }

    @Override
    public Advice findById(Long id) {
        return adviceRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("There is no entity with id: "+id));
    }

    @Override
    public void save(Advice advice) {
        adviceRepository.save(advice);
    }

    @Override
    public void deleteById(Long id) {
        adviceRepository.deleteById(id);
    }

    @Override
    public List<Advice> findAll() {
        return adviceRepository.findAll();
    }

}
