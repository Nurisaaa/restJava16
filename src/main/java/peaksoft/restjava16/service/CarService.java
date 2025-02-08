package peaksoft.restjava16.service;

import peaksoft.restjava16.entities.Car;

public interface CarService {
    Car getCarById(Long id);
    String saveCar(Car car);
    String updateCar(Long id,Car car);
    String deleteCar(Long id);

    String assignCarToUser(Long userId, Long carId);
}
