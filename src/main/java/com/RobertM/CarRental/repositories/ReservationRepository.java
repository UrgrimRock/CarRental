package com.RobertM.CarRental.repositories;


import com.RobertM.CarRental.model.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
