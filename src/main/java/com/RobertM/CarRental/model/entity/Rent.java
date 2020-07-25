package com.RobertM.CarRental.model.entity;

import javax.persistence.*;

@Entity
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Employee employee;
    private String rentDate;
    @OneToOne
    private Reservation reservation;
    private String notes;


}
