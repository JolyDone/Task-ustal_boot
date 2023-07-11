package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaolmp implements CarDao{
    private final List<Car> carList;

    public CarDaolmp(){
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", 1990, "good"));
        carList.add(new Car("BMW", 2003, "best"));
        carList.add(new Car("Mersedes", 1941, "oh..."));
        carList.add(new Car("Pagani", 2020, "ITSTABEST"));
        carList.add(new Car("Honda", 1999, "soso"));
    }


    public List<Car> getCarList(int count){
        if (count==0 || count>5){
            return carList;
        }else {
            return carList.subList(0, count);
        }
    }

}
