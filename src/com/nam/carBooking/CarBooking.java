package com.nam.carBooking;

import com.nam.car.Car;
import com.nam.user.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class CarBooking {
    private User user;
    private UUID id;
    private Car car;
    private LocalDate startD;
    private LocalDate endD;
    private BigDecimal price;
    private BookingStatus status;
    private LocalDateTime bookAt;
    CarBooking(User user, Car car,
                        LocalDate startD, LocalDate endD, UUID id) {

        this.user = user;
        this.id = id;
        this.car = car;
        this.startD = startD;
        this.endD = endD;
        checkDate();
        this.price = calculatePrice(startD, endD);
        this.status = BookingStatus.ACTIVE;
        this.bookAt = LocalDateTime.now();
    }
    public void checkDate(){
        if(startD.isAfter(endD)) throw new IllegalArgumentException() ;
    }
    public void checkUserId(){

    }
    public void checkCarId(){

    }
    public BigDecimal calculatePrice(LocalDate startD, LocalDate endD){
        long days = ChronoUnit.DAYS.between(startD, endD);
        if(days == 0) days = 1;
        return car.getRentalPricePerDay().multiply(BigDecimal.valueOf(days));
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LocalDate getStartD() {
        return startD;
    }

    public void setStartD(LocalDate startD) {
        this.startD = startD;
    }

    public LocalDate getEndD() {
        return endD;
    }

    public void setEndD(LocalDate endD) {
        this.endD = endD;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public LocalDateTime getBookAt() {
        return bookAt;
    }

    public void setBookAt(LocalDateTime bookAt) {
        this.bookAt = bookAt;
    }

    @Override
    public String toString() {
        return "CarBooking{" +
                "user=" + getUser() +
                ", id=" + getId() +
                ", car=" + getCar() +
                ", startD=" + getStartD() +
                ", endD=" + getEndD() +
                ", price=" + getPrice() +
                ", status=" + getStatus() +
                ", bookAt=" + getBookAt() +
                '}';
    }
}
