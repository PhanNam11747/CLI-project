package com.nam.car;

import java.util.Arrays;

public class CarDAO {
    private int ind = 0;
    private Car[] cars = new Car[100];

    public void saveCar(Car car){
        if(ind > 100) System.out.println("the system is overloaded! ");
        cars[ind] = car;
        this.ind += 1;
    }
    public Car[] getCars(){
        return cars;
    }

    @Override
    public String toString() {
        return "CarDAO{" +
                "ind=" + ind +
                ", cars=" + Arrays.toString(getCars()) +
                '}';
    }
}
