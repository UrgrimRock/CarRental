package com.RobertM.CarRental.repositories;

import com.RobertM.CarRental.model.Base;
import com.RobertM.CarRental.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
