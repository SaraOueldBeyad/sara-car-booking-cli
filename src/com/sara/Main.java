package com.sara;

import com.sara.car.Brand;
import com.sara.car.Car;
import com.sara.car.CarService;
import com.sara.carBooking.BookingStatus;
import com.sara.carBooking.CarBooking;
import com.sara.carBooking.CarBookingDAO;
import com.sara.carBooking.CarBookingService;
import com.sara.user.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class Main {
    static void main() {
//        CarService cars = new CarService();
////        System.out.println("Car Booking CLI");
////        System.out.println(CarDAO.getCarById(UUID.fromString("9b2e4f61-7c3a-48d5-912f-65a831c720de")));
////        System.out.println(UserDAO.getUserById(UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3")));
//
//        CarBooking booking = new CarBooking(
//                UUID.randomUUID(),
//                new User(UUID.fromString("8da51d2b-aaaf-4bf2-834a-e02964e10fc3"), "Sara"),
//                new Car(UUID.fromString("c1a7f9d2-3b84-8e56-a921-7d6f0c8b45e3"), "T-002", BigDecimal.valueOf(100), Brand.TESLA, true),
//                LocalDate.of(2026, 9, 10),
//                LocalDate.of(2026, 9, 15),
//                new BigDecimal("250.00"),
//                LocalDateTime.now(),
//                BookingStatus.ACTIVE
//        );
//
//        CarBookingDAO carBookingDAO = new CarBookingDAO();
//
////        carBookingDAO.saveBooking(booking);
////        System.out.println(Arrays.toString(carBookingDAO.getAllBookings()));
////        System.out.println(carBookingDAO.getBookingByCarId(UUID.fromString("ca7f9d2-3b84-8e56-a921-7d6f0c8b45e3")));
//
        CarBookingService carBookingService = new CarBookingService();
        CarBooking myBooking = null;
//
//        try {
//            myBooking = carBookingService.bookCar(UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3"),
//                    UUID.fromString("a5d3c761-28f9-4b40-8e16-93c7f2a54d81"),
//                    LocalDate.of(2026, 9, 13),
//                    LocalDate.of(2026, 9, 15));
//            carBookingService.bookCar(UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3"),
//                    UUID.fromString("a5d3c761-28f9-4b40-8e16-93c7f2a54d81"),
//                    LocalDate.of(2026, 9, 13),
//                    LocalDate.of(2026, 9, 15));
//        } catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        } catch (IllegalStateException e) {
//            System.out.println(e.getMessage());
//        }
//
//        for (CarBooking carBooking : carBookingService.getAllBookings()){
//            System.out.println(carBooking.toString());
//        }
//
//        try {
//            carBookingService.deleteCarBooking(booking.getId());
//        } catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }
//
//        for (CarBooking carBooking : carBookingService.getAllBookings()){
//            System.out.println(carBooking.toString());
//        }

//        try {
//            CarBooking booking1 = carBookingService.bookCar(
//                    UUID.fromString("6ba7b810-9dad-41d1-80b4-00c04fd430c8"),
//                    UUID.fromString("9b2e4f61-7c3a-48d5-912f-65a831c720de"),
//                    LocalDate.of(2026, 9, 15),
//                    LocalDate.of(2026, 9, 18)
//            );
//
//            CarBooking booking2 = carBookingService.bookCar(
//                    UUID.fromString("6ba7b810-9dad-41d1-80b4-00c04fd430c8"),
//                    UUID.fromString("a5d3c761-28f9-4b40-8e16-93c7f2a54d81"),
//                    LocalDate.of(2026, 9, 20),
//                    LocalDate.of(2026, 9, 24)
//            );
//
//            CarBooking booking3 = carBookingService.bookCar(
//                    UUID.fromString("6ba7b810-9dad-41d1-80b4-00c04fd430c8"),
//                    UUID.fromString("4f8b2e93-61d7-45ac-b309-e7a1265c8f42"),
//                    LocalDate.of(2026, 9, 25),
//                    LocalDate.of(2026, 9, 28)
//            );
//        } catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        } catch (IllegalStateException e) {
//            System.out.println(e.getMessage());
//        }
////
//        try {
//            for (CarBooking carBooking : carBookingService.getAllUserBookedCars(UUID.fromString("6ba7b810-9dad-41d1-80b4-00c04fd430c8"))){
//                System.out.println(carBooking.toString());
//            }
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }



    }
}
