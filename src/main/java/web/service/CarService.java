package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getListCars(int count);
}
