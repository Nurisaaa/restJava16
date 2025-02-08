package peaksoft.restjava16.api;

import org.springframework.web.bind.annotation.*;
import peaksoft.restjava16.entities.Car;
import peaksoft.restjava16.service.CarService;

@RestController
@RequestMapping("/api/cars")
public class CarAPI {
    private final CarService carService;

    public CarAPI(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public String saveCar(@RequestBody Car car) {
       return carService.saveCar(car);
    }

    @GetMapping("/{userId}/{carId}")
    public String assignCarToUser(@PathVariable Long userId, @PathVariable Long carId) {
        return carService.assignCarToUser(userId,carId);
    }

}
