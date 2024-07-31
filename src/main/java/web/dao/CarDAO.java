package web.dao;


import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {

    private static int CAR_COUNT; // это все можно полодить в класс DAO

    private List<Car> cars;

    // такой интересный блок инициализвции юзану, не понял, почему без него не работает
    {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_COUNT, "Lada", "Granta")); // или ++CAR_COUNT
        cars.add(new Car(++CAR_COUNT, "Opel", "Omega"));
        cars.add(new Car(++CAR_COUNT, "Nissan", "XTrail"));
        cars.add(new Car(++CAR_COUNT, "WW", "Toureq"));
        cars.add(new Car(++CAR_COUNT, "Porshe", "Panamera"));
    }


    public List<Car> printCars(int id) { // возвращаем часть списка по ID
        List<Car> response = new ArrayList<>();
        if (id >= 5 & !cars.isEmpty()) {
            return cars;
        }
        if (!cars.isEmpty()) {
            for (Car car : cars) {
                if (car.getCarId() <= id) {
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