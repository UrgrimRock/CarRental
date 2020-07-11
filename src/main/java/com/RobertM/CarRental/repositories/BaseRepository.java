package com.RobertM.CarRental.repositories;

import com.RobertM.CarRental.model.Base;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BaseRepository extends CrudRepository<Base, Long> {

    List<Base> findByName(String name);
    List<Base> findByAdres(String adres);
   // List<Base> findByAgeBetween(Integer from, Integer to);
   // List<Base> findById(Integer uuid, Integer tuuid2);
}
