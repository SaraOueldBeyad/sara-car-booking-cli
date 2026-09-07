package com.sara.car;

import java.math.BigDecimal;
import java.util.UUID;

public class CarDAO {

    private static final Car[] cars;

    static {
        cars = new Car[] {
                new Car(UUID.randomUUID(), "T-001", BigDecimal.valueOf(80), Brand.TESLA, true),
                new Car(UUID.randomUUID(), "T-002", BigDecimal.valueOf(100), Brand.TESLA, true),
                new Car(UUID.randomUUID(), "T-001", BigDecimal.valueOf(75), Brand.AUDI, false),
                new Car(UUID.randomUUID(), "T-002", BigDecimal.valueOf(95), Brand.AUDI, true),
                new Car(UUID.randomUUID(), "T-001", BigDecimal.valueOf(100), Brand.MERCEDES, false),
                new Car(UUID.randomUUID(), "T-001", BigDecimal.valueOf(70), Brand.TOYOTA, false)
        };
    }

    public Car[] getCars() {
        return cars;
    }
}
