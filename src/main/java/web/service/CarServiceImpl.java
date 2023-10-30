package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService{

    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("TOYOTA RAV4", "White", 2020));
        cars.add(new Car("AUDI Q7", "Black", 2019));
        cars.add(new Car("SUZUKI GRAND VITARA", "Blue", 2017));
        cars.add(new Car("VOLKSWAGEN TOUAREG", "Black", 2020));
        cars.add(new Car("LADA NIVA", "White", 2023));
    }

    @Override
    public List<Car> getSomeCars(int count) {
        if (count > cars.size()) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
