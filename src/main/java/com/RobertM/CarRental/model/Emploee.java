package com.RobertM.CarRental.model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Emploee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String surname;
    private Boolean isManager;
    @ManyToOne
    @JoinTable(name = "base_emploee", @JoinColumn(name = "emploee_id"),
                inverseJoinColumns = @JoinColumn(name = "base_id"))
    private Set<Base> base;

    public Emploee() {
    }

    public Emploee(String name, String surname, Boolean isManager, Set<Base> base) {
        this.name = name;
        this.surname = surname;
        this.isManager = isManager;
        this.base = base;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Boolean getManager() {
        return isManager;
    }

    public void setManager(Boolean manager) {
        isManager = manager;
    }

    public Set<Base> getBase() {
        return base;
    }

    public void setBase(Set<Base> workPlace) {
        this.base = workPlace;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", isManager=" + isManager +
                ", base=" + base +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emploee emploee = (Emploee) o;

        return id != null ? id.equals(emploee.id) : emploee.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
