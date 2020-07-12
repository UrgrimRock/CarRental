package com.RobertM.CarRental.model.entity;

import javax.persistence.*;


@Entity
public class Base {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String adres;


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


}