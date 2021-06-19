package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDAOImpl implements CarDAO {

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Tesla1", 2021, 100));
        cars.add(new Car("Tesla2", 2021, 111));
        cars.add(new Car("Tesla3", 2021, 200));
        cars.add(new Car("Tesla4", 2021, 222));
        cars.add(new Car("Tesla5", 2021, 300));
    }


    @Override
    public List<Car> getListCars(int count) {
        List<Car> newList = new ArrayList<>();
                for (int i = 0; i < count; i++) {
                    newList.add(cars.get(i));
                }
                return newList;
    }
}
