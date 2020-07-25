package com.RobertM.CarRental.model.dto;


public class ReservationDto {

    private Long id;
    private String date;
    private Long userId;
    private Long carId;
    private Integer fromDate;
    private Integer toDate;
    private Long baseId;

    public ReservationDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Integer getFromDate() {
        return fromDate;
    }

    public void setFromDate(Integer fromDate) {
        this.fromDate = fromDate;
    }

    public Integer getToDate() {
        return toDate;
    }

    public void setToDate(Integer toDate) {
        this.toDate = toDate;
    }

    public Long getBaseId() {
        return baseId;
    }

    public void setBaseId(Long baseId) {
        this.baseId = baseId;
    }
}
