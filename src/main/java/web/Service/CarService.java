package web.Service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarService implements CarServiceImp{
    private static List<Car> cars;
    @Override
    public List<Car> getCars(int count) {
        cars = new ArrayList<>();
        cars.add(new Car(1,"Toyota" , "Corolla"));
        cars.add(new Car(2,"Mazda" , "3 series"));
        cars.add(new Car(3,"BMW" , "Samurai"));
        cars.add(new Car(4,"Mers" , "Kaban"));
        cars.add(new Car(5,"Opel" , "Astra"));

        if (count > cars.size() | count < 0) {
            count = cars.size();
        }

        return cars.stream().limit(count).toList();

    }
}
