package peaksoft.restjava16.service;

import peaksoft.restjava16.entities.Car;
import peaksoft.restjava16.entities.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    String saveUser(User user);
    User getUser(Long id);
    List<User> getUsers();
    String deleteUser(Long id);
    String updateUser(Long id,User user);

    Map<User, List<Car>> getUsersWithCars();
}
