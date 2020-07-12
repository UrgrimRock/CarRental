package com.RobertM.CarRental.model.dto;



public class BaseDto {


    public BaseDto() {
    }

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
