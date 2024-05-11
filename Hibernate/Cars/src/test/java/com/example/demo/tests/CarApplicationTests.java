package com.example.demo.tests;

import com.example.demo.models.Car;
import com.example.demo.repositories.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class CarApplicationTests {

    @Autowired
    private CarRepository carRepository;

    @Test
    public void testSaveCar() {
        Car car = new Car();
        car.setMake("Trabant");
        car.setModel("P70");
        car.setRegNumber("W 7699 OO");
        carRepository.save(car);

        assertNotNull(car.getId());
    }

    @Test
    public void testFindAllCars() {
        List<Car> cars = carRepository.findAll();

        assertNotNull(cars);
        assertEquals(6, cars.size()); 
    }

 
}
