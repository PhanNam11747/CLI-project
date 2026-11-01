package com.nam.carBooking;


import com.nam.car.Car;
import com.nam.user.User;
import com.nam.user.UserDAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class CarBookingService {
    private CarBookingDAO booking = new CarBookingDAO();

    public void addBooking(CarBooking book){
        if(book.getStartD().isAfter(book.getEndD()))
            throw new IllegalArgumentException("day start cannot be after day end");

        for(CarBooking c : booking.getBooking()){
            if(c.getCar().getId().equals(book.getId())
                    && c.getUser().getId().equals(book.getId())
                    && c.getStatus() == BookingStatus.ACTIVE ){
                throw new IllegalStateException("Car is already booked.");
            }
        }
        booking.saveBooking(book);
    }
    public ArrayList<CarBooking> getBookingList(){
        return booking.getBooking();
    }
}
