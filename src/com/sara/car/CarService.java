package com.sara.car;

import java.util.Arrays;

public class CarService {

    private final CarDAO carDAO = new CarDAO();

    public Car[] getElectricCars() {

        Car[] cars = carDAO.getCars();
        Car[] carTemp = new Car[cars.length];
        int count = 0;

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].isElectric()){
                carTemp[count] = cars[i];
                count++;
            }
        }

        carTemp = Arrays.copyOf(carTemp, count);
        return carTemp;
    }

}
