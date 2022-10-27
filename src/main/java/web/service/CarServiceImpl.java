package web.service;

import org.springframework.stereotype.Component;
import web.Dao.CarDao;
import web.Dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
@Component
public class CarServiceImpl implements  CarService {
    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }


    public List<Car> getCarList(int i) {
        return carDao.getCarList(i);
    }
}