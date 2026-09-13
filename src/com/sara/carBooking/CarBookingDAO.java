package com.sara.carBooking;

import com.sara.car.Car;
import com.sara.car.CarDAO;

import java.util.Arrays;
import java.util.UUID;

public class CarBookingDAO {

    CarBooking[] carBookings = new CarBooking[20];
    CarDAO carDAO = new CarDAO();

    public CarBooking[] getAllBookings() {
        CarBooking[] carB = new CarBooking[carBookings.length];
        int count = 0;
        for (int i = 0; i < carBookings.length; i++) {
            if (carBookings[i] == null) {
                continue;
            } else {
                carB[count] = carBookings[i];
                count++;
            }
        }
        carB = Arrays.copyOf(carB, count);
        return carB;
    }

    public CarBooking getBookingByCarId(UUID carId) {
        for (int i = 0; i < carBookings.length; i++) {
            if (carBookings[i] != null && carBookings[i].getCar().getId().equals(carId)) {
                return carBookings[i];
            }
        }
        return null;
    }

    public void saveBooking(CarBooking carBooking) {
        for (int i = 0; i < carBookings.length; i++) {
            if (carBookings[i] == null) {
                carBookings[i] = carBooking;
                return;
            }
        }
        int length = carBookings.length;
        carBookings = Arrays.copyOf(carBookings, carBookings.length * 2);
        carBookings[length] = carBooking;
    }

    public void deleteBooking(UUID bookingID){
        for (int i = 0; i < carBookings.length; i++) {
            if (carBookings[i] != null && carBookings[i].getId().equals(bookingID)){
                carBookings[i].setStatus(BookingStatus.CANCELLED);
                return;
            }
        }
    }

    public CarBooking[] getAllUserBookedCars(UUID userId){
        int count = 0;
        CarBooking[] carB = new CarBooking[carBookings.length];
        for (int i = 0; i < carBookings.length; i++) {
            if (carBookings[i] != null && carBookings[i].getUser().getId().equals(userId)){
                carB[count] = carBookings[i];
                count++;
            }
        }
        carB = Arrays.copyOf(carB, count);
        return carB;
    }
}
