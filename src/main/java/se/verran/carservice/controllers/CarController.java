package se.verran.carservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.verran.carservice.entities.Car;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    @GetMapping("/all")
    public List<Car> fetchAll(){
        return List.of(new Car("Volvo"));
    }
}
