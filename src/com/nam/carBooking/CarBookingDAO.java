package com.nam.carBooking;

import java.util.ArrayList;

public class CarBookingDAO {
    private ArrayList<CarBooking> bookingList = new ArrayList<>();

    public void saveBooking(CarBooking book) {
        if(BookingStatus.ACTIVE == book.getStatus()) {
            System.out.println("this car has already booked");
        }
        else {
            bookingList.add(book);
        }
    }
    public void cancelBooking(CarBooking book){

    }
    public ArrayList<CarBooking> getBooking(){
        return bookingList;
    }
}
