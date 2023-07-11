package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServicelmp;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    private final CarServicelmp carServicelmp;

    public CarController(CarServicelmp carServicelmp){
        this.carServicelmp = carServicelmp;
    }


    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "0") int count, ModelMap model) {
        List<Car> cars = carServicelmp.getCarList(count);
        model.addAttribute("cars", cars);
        return "cars";
    }


}
