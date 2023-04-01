package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements  CarService {

    private CarDao carDao;
    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getListCars(int count) {
        if (count < carDao.getCars().size()) {
            List<Car> result  = new ArrayList<>();

            for(int i = 0; i < count; i++ ) {
             result.add(carDao.getCars().get(i));
            }
            return result;
        }
        return carDao.getCars();
    }

}
