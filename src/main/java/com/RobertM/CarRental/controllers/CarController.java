package com.RobertM.CarRental.controllers;


import com.RobertM.CarRental.model.dto.BaseDto;
import com.RobertM.CarRental.model.dto.CarDto;
import com.RobertM.CarRental.repositories.CarRepository;
import com.RobertM.CarRental.service.BaseService;
import com.RobertM.CarRental.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarRepository carRepository;

    @Autowired
    CarService carService;

    @Autowired
    BaseService baseService;

    @GetMapping("/cars")
    public String getAllCars(Model model) {
        List<CarDto> cars = carService.getAllCars();
        model.addAttribute("carsList", cars);
        return "cars";
    }
    @GetMapping("/carsEditor")
    public String getAllCarsAdmin(Model model) {
        List<CarDto> cars = carService.getAllCars();
        model.addAttribute("carsList", cars);
        return "carsEditor";
    }

    @GetMapping("/addCar")
    public String addCarForm(Model model) {
        List<BaseDto> bases = baseService.getAllBases();
        model.addAttribute("basesList", bases);
        return "addCar";
    }

    @PostMapping("/addCar")
    public String addCar(CarDto carDto) {
        carService.saveCar(carDto);
        return "redirect:/carsEditor";
    }
}
