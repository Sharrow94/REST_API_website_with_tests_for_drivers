package pl.zdajegzamin.driverswebsite.serviceImpl;

import org.springframework.stereotype.Service;
import pl.zdajegzamin.driverswebsite.entity.User;
import pl.zdajegzamin.driverswebsite.repository.UserRepository;
import pl.zdajegzamin.driverswebsite.service.UserService;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("There is no entity with id: "+id));
    }
}
