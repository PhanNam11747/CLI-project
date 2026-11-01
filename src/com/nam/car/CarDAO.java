package com.nam.car;

import java.util.ArrayList;
import java.util.Arrays;

public class CarDAO {
    private ArrayList<Car> cars = new ArrayList<>();

    public void saveCar(Car car){
        cars.add(car);
    }
    public ArrayList<Car> getCars(){
        return cars;
    }

    @Override
    public String toString() {
        return "CarDAO{" +
                "cars=" + getCars() +
                '}';
    }
}
