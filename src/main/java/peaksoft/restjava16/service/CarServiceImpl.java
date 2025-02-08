package peaksoft.restjava16.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import peaksoft.restjava16.entities.Car;
import peaksoft.restjava16.entities.User;
import peaksoft.restjava16.repositories.CarRepository;
import peaksoft.restjava16.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    private final UserRepository userRepository;

    public CarServiceImpl(CarRepository carRepository, UserRepository userRepository) {
        this.carRepository = carRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Car getCarById(Long id) {
        return null;
    }

    @Override
    public String saveCar(Car car) {
        carRepository.save(car);
        return "car saved";
    }

    @Override
    public String updateCar(Long id, Car car) {
        return "";
    }

    @Override
    public String deleteCar(Long id) {
        return "";
    }

    @Transactional
    @Override
    public String assignCarToUser(Long userId, Long carId) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new RuntimeException("User whith id " + userId + " not found")
        );
        Car car = carRepository.findById(carId).orElseThrow(
                () -> new RuntimeException("Car with id " + carId + " not found")
        );
        List<Car> cars = new ArrayList<>();
        cars.add(car);
        user.setCars(cars);
        car.setUser(user);
        return "car assigned";
    }
}
