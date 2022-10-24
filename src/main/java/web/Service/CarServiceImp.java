package web.Service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.List;

public interface CarServiceImp {
    List<Car> getCars(int id);
}
