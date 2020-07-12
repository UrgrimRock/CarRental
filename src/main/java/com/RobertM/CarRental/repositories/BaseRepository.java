package com.RobertM.CarRental.repositories;

import com.RobertM.CarRental.model.entity.Base;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BaseRepository extends JpaRepository<Base, Long> {

//    List<Base> findByName(String name);
//    List<Base> findByAdres(String adres);
   // List<Base> findByAgeBetween(Integer from, Integer to);
   // List<Base> findById(Integer uuid, Integer tuuid2);
}
