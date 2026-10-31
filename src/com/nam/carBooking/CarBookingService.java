package com.nam.carBooking;

import com.nam.car.Car;
import com.nam.user.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarBookingService {
    ArrayList<CarBooking> list = new ArrayList<>();
    public CarBooking booking(User user, Car car, LocalDate startD, LocalDate endD){
        if(isCarBooked(car)){
            System.out.println("car already booked");
        }
        CarBooking item = new CarBooking(user, car, startD,endD);
        list.add(item);
        return item;
    }
    public boolean isCarBooked(Car car) {
        return list.stream()
                .anyMatch(b -> b.getCar().equals(car) &&
                        b.getStatus() == BookingStatus.ACTIVE);
    }
}
