package peaksoft.restjava16.api;

import org.springframework.web.bind.annotation.*;
import peaksoft.restjava16.entities.Car;
import peaksoft.restjava16.entities.User;
import peaksoft.restjava16.service.UserService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserAPI {
    private final UserService userService;

    public UserAPI(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping
    public String saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

    @GetMapping("/cars")
    public Map<User, List<Car>> getCarsByUser() {
        return userService.getUsersWithCars();
    }

}
