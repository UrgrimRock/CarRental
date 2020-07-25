package com.RobertM.CarRental.repositories;


import com.RobertM.CarRental.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
