package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> cars(Integer count) {
        List<Car> cars = new ArrayList<>();
        {
            cars.add(new Car(1L, "BMW", 1999));
            cars.add(new Car(2L, "UAZ", 2008));
            cars.add(new Car(3L, "RENO", 2002));
            cars.add(new Car(4L, "VAZ", 2015));
            cars.add(new Car(5L, "ZAZ", 2012));
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
