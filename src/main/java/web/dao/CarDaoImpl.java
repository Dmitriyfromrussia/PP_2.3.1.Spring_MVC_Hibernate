package web.dao;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository // @Component NB РАЗОБРАТЬСЯя!!!!!
public class CarDaoImpl implements CarDao{

    private static int CAR_COUNT;

    private List<Car> cars;


    {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_COUNT, "Lada", "Granta")); // или ++CAR_COUNT
        cars.add(new Car(++CAR_COUNT, "Opel", "Omega"));
        cars.add(new Car(++CAR_COUNT, "Nissan", "XTrail"));
        cars.add(new Car(++CAR_COUNT, "WW", "Toureq"));
        cars.add(new Car(++CAR_COUNT, "Porshe", "Panamera"));
    }


    public List<Car> getCarsByCount(int count) { // возвращаем часть списка по ID
        List<Car> response = new ArrayList<>();
        if (count >= 5 & !cars.isEmpty()) {
            return cars;
        }
        if (!cars.isEmpty()) {
            for (Car car : cars) {
                if (car.getCarId() <= count) {
                    response.add(car);
                }
            }
            return response;
        } else {
            response.add(new Car(0,"NOCARS", "NOTHING CAR"));
            System.out.println("List cars is empty");
            return response;
        }
    }
}