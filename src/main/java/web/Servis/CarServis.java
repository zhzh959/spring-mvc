package web.Servis;

import web.Models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServis {


    public static List <Car> getListCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("LADA", "1012", "1.6"));
        cars.add(new Car("HONDA", "ELEMENT", "2.4"));
        cars.add(new Car("GAZ", "3110", "2.5"));
        cars.add(new Car("TOYOTA", "CAMRY", "2.0"));
        cars.add(new Car("TOYOTA", "COROLLA","1.5"));
        return cars;
    }

    public static List<Car> carsCount(List<Car> cars, int number) {
        if (number == 0 || number > 5) {
            return cars;
        }
        return cars.stream().limit(number).collect(Collectors.toList());
    }

}
