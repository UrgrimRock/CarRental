package com.RobertM.CarRental.repositories;


import com.RobertM.CarRental.model.entity.Emploee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploeeRepository extends JpaRepository<Emploee, Long> {

}
