package com.RobertM.CarRental.service;


import com.RobertM.CarRental.mapper.CarMapper;
import com.RobertM.CarRental.model.dto.CarDto;
import com.RobertM.CarRental.model.entity.Base;
import com.RobertM.CarRental.model.entity.Car;
import com.RobertM.CarRental.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {


    @Autowired
    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<CarDto> getAllCars(){
        Iterable<Car> carsList= carRepository.findAll();
        ArrayList<CarDto> result = new ArrayList<>();
        for (Car car : carsList){
            result.add(CarMapper.INSTANCE.carToDto(car));
        }
        return result;
    }
    public void deleteBaseById(Long id) {
        carRepository.deleteById(id);
    }

    public CarDto getBaseById(Long id) {
        Optional<Car> car = carRepository.findById(id);
        if(car.isPresent()) {
            return CarMapper.INSTANCE.carToDto(car.get());
        }
        return null;
    }


    public void saveCar(CarDto carDto){
        Car car = CarMapper.INSTANCE.dtoToCar(carDto);
        Base base = new Base();
        base.setId(carDto.getBaseId().longValue());
        car.setBase(base);
        carRepository.save(car);
    }
}
