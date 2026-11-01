package com.nam.car;

import java.util.ArrayList;

public class CarService {
    //saving to the carDAO
    private CarDAO sv = new CarDAO();
    public void addCar(Car car){

        sv.saveCar(car);
    }
    public ArrayList<Car> getCars(){
        return sv.getCars();
    }
}
