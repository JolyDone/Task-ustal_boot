package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaolmp implements CarDao{
    private static final List<Car> carList = List.of(
            new Car("Toyota", 1990, "good"),
            new Car("BMW", 2003, "best"),
            new Car("Mersedes", 1941, "oh..."),
            new Car("Pagani", 2020, "ITSTABEST"),
            new Car("Honda", 1999, "soso"),
            new Car("MrBeanCar", 1999, "sick"),
            new Car("Honda Civic", 1999, "soso"));

    @Override
    public List<Car> getCarList(){
        //return new ArrayList<>(carList);
        return carList;
    }

}
