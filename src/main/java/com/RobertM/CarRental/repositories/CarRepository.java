package com.RobertM.CarRental.repositories;


import com.RobertM.CarRental.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarRepository extends JpaRepository<Car, Long> {
}
