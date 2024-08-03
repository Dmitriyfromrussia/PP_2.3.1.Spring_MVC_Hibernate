package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Controller
public class CarsController {

    private CarDaoImpl carDaoImpl;

    public CarsController(@Autowired CarDaoImpl carDaoImpl) { // поидее можно не указывать аннотацию
        this.carDaoImpl = carDaoImpl;
    }

    @GetMapping("/cars")
    public String printCar(@RequestParam(value = "count", required = false) Integer count, Model model) {

        List<Car> cars = carDaoImpl.getCarsByCount(count);

        if (!cars.isEmpty()) {
            model.addAttribute("TableMessage", "This is list of cars");
            model.addAttribute("response", cars);
        } else {
            model.addAttribute("TableMessage", "List cars !isEmty or need correct count in parameters"); // при вводе параметров cars?count=0
        }
        return "cars";
    }
}

