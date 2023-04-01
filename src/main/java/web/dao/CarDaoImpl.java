package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW","red","V8"));
        cars.add(new Car("LADA","white","V4"));
        cars.add(new Car("TOYOTA","black","V6"));
        cars.add(new Car("VAZ","black","V4"));
        cars.add(new Car("GAZ","yellow","V4"));
    }
    @Override
    public List<Car> getCars() {
        return cars;
    }
}
