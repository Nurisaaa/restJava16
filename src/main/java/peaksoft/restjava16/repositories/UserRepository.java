package peaksoft.restjava16.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.restjava16.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
