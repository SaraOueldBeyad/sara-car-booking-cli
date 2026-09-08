package com.sara;

import com.sara.car.Car;
import com.sara.car.CarDAO;
import com.sara.user.UserDAO;

import java.util.UUID;

public class Main {
    static void main() {
        System.out.println("Car Booking CLI");
        System.out.println(CarDAO.getCarById(UUID.fromString("9be4f61-7c3a-48d5-912f-65a831c720de")));
        System.out.println(UserDAO.getUserById(UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3")));
    }
}
