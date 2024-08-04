package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {

    private final CarServiceImpl carServiceImpl;

    public CarsController(@Autowired CarServiceImpl carServiceImpl) { // поидее можно не указывать аннотацию
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping("/cars")
    public String viewCar(@RequestParam(value = "count", required = false) Integer count, Model model) {

        List<Car> cars = carServiceImpl.getCarsByCount(count);

        if (!cars.isEmpty()) {
            model.addAttribute("TableMessage", "This is list of cars");
            model.addAttribute("response", cars);
        } else {
            model.addAttribute("TableMessage", "List cars !isEmty or need correct count in parameters"); // при вводе параметров cars?count=0
        }
        return "cars";
    }
}

