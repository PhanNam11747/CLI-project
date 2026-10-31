package com.nam.car;

public class CarService {
    //saving to the carDAO
    CarDAO sv = new CarDAO();
    void addCar(Car car){
        sv.saveCar(car);
    }
}
