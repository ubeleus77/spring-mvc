package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;


@Controller
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping
    public String getCars(@RequestParam (value = "count", required = false) int count, Model model){
        List<Car> cars;
        if(count == 0 || count >=5 ){
            cars = carService.getListCars(5);
        }else{
            cars = carService.getListCars(count);
        }
        model.addAttribute("cars", cars);


        return "cars";
    }
}
