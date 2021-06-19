package web.service;


import com.sun.glass.ui.Clipboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO dao ;

    @Override
    public List<Car> getListCars(int count) {
     return dao.getListCars(count);
    }

}
