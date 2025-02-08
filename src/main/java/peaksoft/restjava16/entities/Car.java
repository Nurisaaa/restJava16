package peaksoft.restjava16.entities;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "car_gen")
    @SequenceGenerator(name = "car_gen", sequenceName = "car_seq")
    private Long id;
    private String name;
    private String model;
    @ToString.Exclude
    @ManyToOne
    private User user;

    public Car(Long id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public Car() {
    }

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
