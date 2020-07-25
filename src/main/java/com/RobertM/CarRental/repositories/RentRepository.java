package com.RobertM.CarRental.repositories;

import com.RobertM.CarRental.model.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RentRepository extends JpaRepository<Rent, Long> {
    
}
