package peaksoft.restjava16.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.restjava16.entities.Car;
import peaksoft.restjava16.entities.User;
import peaksoft.restjava16.repositories.UserRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String saveUser(User user) {
        userRepository.save(user);
        return "User saved successfully";
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User not found with id: " + id)
        );
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "user deleted successfully";
    }

    @Override
    public String updateUser(Long id, User user) {
        return "";
    }

    @Override
    public Map<User, List<Car>> getUsersWithCars() {
        List<User> users = userRepository.findAll();
        Map<User, List<Car>> map = new HashMap<>();
        for (User user1 : users) {
            map.put(user1, user1.getCars());
        }
        System.out.println(map);
        return map;
    }
}
