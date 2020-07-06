package com.RobertM.CarRental.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Base {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String adres;
    @OneToMany(mappedBy = "base")
    private List<Car> carList;
    @OneToMany(mappedBy = "base")
    private List<Emploee> emploeeList;

    public Base() {
    }

    public Base(String adres, List<Car> carList, List<Emploee> emploeeList) {
        this.adres = adres;
        this.carList = carList;
        this.emploeeList = emploeeList;
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

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public List<Emploee> getEmploeeList() {
        return emploeeList;
    }

    public void setEmploeeList(List<Emploee> emploeeList) {
        this.emploeeList = emploeeList;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", adres='" + adres + '\'' +
                ", carList=" + carList +
                ", emploeeList=" + emploeeList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Base base = (Base) o;

        return id != null ? id.equals(base.id) : base.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
