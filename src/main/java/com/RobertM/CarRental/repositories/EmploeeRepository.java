package com.RobertM.CarRental.repositories;

import com.RobertM.CarRental.model.Base;
import com.RobertM.CarRental.model.Emploee;
import org.springframework.data.repository.CrudRepository;

public interface EmploeeRepository extends CrudRepository<Emploee, Long> {
}
