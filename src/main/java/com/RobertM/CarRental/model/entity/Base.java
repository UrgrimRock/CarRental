package com.RobertM.CarRental.model.entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class Base {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String adres;
    @OneToMany
    private List<Car> cars;


    public Base() {
    }

    public Base(String name, String adres) {

        this.name = name;
        this.adres = adres;
    }

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
