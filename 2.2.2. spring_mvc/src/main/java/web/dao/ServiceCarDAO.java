package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Component
public class ServiceCarDAO {
    private static int CAR_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_COUNT, "BMW", "black"));
        cars.add(new Car(++CAR_COUNT, "Mercedes", "grey"));
        cars.add(new Car(++CAR_COUNT, "Audi", "white"));
        cars.add(new Car(++CAR_COUNT, "Toyota", "black"));
        cars.add(new Car(++CAR_COUNT, "Ferrari", "red"));
    }

    public List<Car> getCarsWithCount(int count) {
        if (count >= 5) {
            return cars;
        }
        ArrayList<Car> result = new ArrayList<>();
        for (int i = 0; i != count; i++) {
            result.add(cars.get(i));
        }
        return result;
    }
}
