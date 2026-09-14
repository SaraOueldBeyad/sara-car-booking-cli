package com.sara.carBooking;

import com.sara.car.Car;
import com.sara.car.CarDAO;
import com.sara.car.CarService;
import com.sara.user.User;
import com.sara.user.UserDAO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.UUID;

public class CarBookingService {
    private final UserDAO userDao = new UserDAO();
    private final CarDAO carDao = new CarDAO();
    private final CarBookingDAO carBookingDAO = new CarBookingDAO();


    public CarBooking bookCar(UUID userId,
                              UUID carId,
                              LocalDate startDate,
                              LocalDate endDate){
        User user = userDao.getUserById(userId);
        if (user == null){
            throw new IllegalArgumentException("No user found with this ID: " + userId);
        }

        Car car = carDao.getCarById(carId);
        if (car == null){
            throw new IllegalArgumentException("No car found with this ID: " + carId);
        }

        if (startDate.isBefore(LocalDate.now()) || !endDate.isAfter(startDate)){
            throw new IllegalArgumentException("startDate must not be in the past" +
                    " and endDate must be after.");
        }

        CarBooking[] currentBookings = carBookingDAO.getAllBookings();
        for (CarBooking carBooking : currentBookings) {
            if (carBooking.getCar().equals(car) && carBooking.getStatus().equals(BookingStatus.ACTIVE)) {
                throw new IllegalStateException("Booking not possible for this car");
            }
        }

        int numberOfDays = (int) ChronoUnit.DAYS.between(startDate, endDate);

        BigDecimal price = car.getRentalPricePerDay().multiply(BigDecimal.valueOf(numberOfDays));

        CarBooking carBooking = new CarBooking(UUID.randomUUID(),
                user,
                car,
                startDate,
                endDate,
                price,
                LocalDateTime.now(),
                BookingStatus.ACTIVE);

        carBookingDAO.saveBooking(carBooking);

        System.out.println("Your booking was successfully created.");

        return carBooking;
    }

//    public CarBooking[] getAllActiveBookings() {
//        CarBooking[] currentBookings = carBookingDAO.getAllBookings();
//        CarBooking[] carB = new CarBooking[currentBookings.length];
//        for (int i = 0; i < currentBookings.length; i++) {
//            if (currentBookings[i].getStatus().equals(BookingStatus.ACTIVE)){
//                carB[i] = currentBookings[i];
//            }
//        }
//        return carB;
//    }

    public CarBooking[] getAllBookings(){
        return carBookingDAO.getAllBookings();
    }

    public void deleteCarBooking(UUID carBookingId){
        if (carBookingId == null){
            throw new IllegalArgumentException("Please provide a non null Car Booking");
        } else {
            carBookingDAO.deleteBooking(carBookingId);
        }
    }

    public CarBooking[] getAllUserBookedCars(UUID userId){
        if (userId == null){
            throw new IllegalArgumentException("Please provide a valid userId");
        } else {
            return carBookingDAO.getAllUserBookedCars(userId);
        }
    }

    public Car[] getAvailableCars() {
        Car[] cars = carDao.getCars();
        Car[] carTemp = new Car[cars.length];
        int count = 0;
        boolean isActive = false;
        CarBooking[] bookings = carBookingDAO.getAllBookings();

        for (int i = 0; i < cars.length; i++) {
            isActive = false;
            for (int j = 0; j < bookings.length; j++) {
                if (bookings[j].getCar().getId().equals(cars[i].getId()) && bookings[j].getStatus().equals(BookingStatus.ACTIVE)){
                    isActive = true;
                    break;
                }
            }
            if (!isActive){
                carTemp[count] = cars[i];
                count++;
            }
        }

        carTemp = Arrays.copyOf(carTemp, count);
        return carTemp;
    }
}
