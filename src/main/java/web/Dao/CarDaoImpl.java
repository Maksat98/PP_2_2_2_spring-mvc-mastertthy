package web.Dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements  CarDao {
    private int CARS_ID;

    private final List<Car> MyCars = new ArrayList<>();

    {
        MyCars.add(new Car(++CARS_ID, "BMW", "5series"));
        MyCars.add(new Car(++CARS_ID, "AUDI", "a7"));
        MyCars.add(new Car(++CARS_ID, "Mercedes", "e200"));
        MyCars.add(new Car(++CARS_ID, "Toyota", "Camry"));
        MyCars.add(new Car(++CARS_ID, "RangeRover", "Evoque"));

    }


    @Override
    public List<Car> getCarList(int i) {
        if (i <= 0) {
            return MyCars;
        }
        return MyCars.stream().limit(i).toList();
    }

}
