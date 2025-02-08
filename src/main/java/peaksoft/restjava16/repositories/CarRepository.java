package peaksoft.restjava16.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.restjava16.entities.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
