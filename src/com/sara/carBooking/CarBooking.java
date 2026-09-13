package com.sara.carBooking;

import com.sara.car.Car;
import com.sara.user.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class CarBooking {

    private UUID id;
    private User user;
    private Car car;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal price;
    private LocalDateTime bookedAt;
    private BookingStatus status;

    public CarBooking(UUID id, User user, Car car, LocalDate startDate, LocalDate endDate, BigDecimal price, LocalDateTime bookedAt, BookingStatus status) {
        this.id = id;
        this.user = user;
        this.car = car;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.bookedAt = bookedAt;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getBookedAt() {
        return bookedAt;
    }

    public void setBookedAt(LocalDateTime bookedAt) {
        this.bookedAt = bookedAt;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CarBooking{" +
                "\nid=" + id +
                ", \nuser=" + user +
                ", \ncar=" + car +
                ", \nstartDate=" + startDate +
                ", \nendDate=" + endDate +
                ", \nprice=" + price +
                ", \nbookedAt=" + bookedAt +
                ", \nstatus=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CarBooking that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(user, that.user) && Objects.equals(car, that.car) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate) && Objects.equals(price, that.price) && Objects.equals(bookedAt, that.bookedAt) && status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, car, startDate, endDate, price, bookedAt, status);
    }
}
