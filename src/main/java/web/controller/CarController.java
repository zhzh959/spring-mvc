package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Models.Car;
import web.Servis.CarServis;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@Controller
public class CarController {
//    @GetMapping("/cars")
//    public String getListCar() {
//
//        return "pages/cars";
//    }
@GetMapping("/cars")
public String getCars(@RequestParam(value="count", defaultValue = "5", required = false) int elCars, Model model) {
    List <Car> list= CarServis.carsCount(CarServis.getListCars(), elCars);
    model.addAttribute("list", list);
    return "cars";
}




}

