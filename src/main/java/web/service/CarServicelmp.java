package web.service;


import org.springframework.stereotype.Service;
import web.dao.CarDaolmp;
import web.model.Car;

import java.util.List;

@Service
public class CarServicelmp implements CarService{
    private final CarDaolmp carDaolmp;

    public CarServicelmp(CarDaolmp carDaolmp) {
        this.carDaolmp = carDaolmp;
    }
    @Override
    public List<Car> getCarList(int count) {
        return carDaolmp.getCarList(count);
    }
}
