package com.RobertM.CarRental.model.dto;


import com.RobertM.CarRental.model.entity.Car;

import java.util.List;

public class BaseDto {


    public BaseDto() {
    }

    private Long id;
    private String name;
    private String adres;
    private List<Car> cars;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
