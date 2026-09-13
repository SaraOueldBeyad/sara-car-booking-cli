package com.sara.car;

import java.math.BigDecimal;
import java.util.UUID;

public class CarDAO {

    private static final Car[] cars;

    static {
        cars = new Car[] {
                new Car(UUID.fromString("9b2e4f61-7c3a-48d5-912f-65a831c720de"), "T-001", BigDecimal.valueOf(80), Brand.TESLA, true),
                new Car(UUID.fromString("c1a7f9d2-3b84-4e56-a921-7d6f0c8b45e3"), "T-002", BigDecimal.valueOf(100), Brand.TESLA, true),
                new Car(UUID.fromString("72e4b8a1-9c35-4f67-b2d0-18a6e53c94f7"), "A-001", BigDecimal.valueOf(75), Brand.AUDI, false),
                new Car(UUID.fromString("a5d3c761-28f9-4b40-8e16-93c7f2a54d81"), "A-002", BigDecimal.valueOf(95), Brand.AUDI, true),
                new Car(UUID.fromString("4f8b2e93-61d7-45ac-b309-e7a1265c8f42"), "M-001", BigDecimal.valueOf(100), Brand.MERCEDES, false),
                new Car(UUID.fromString("d93a6c15-7e28-4f51-9b64-2c8a703de195"), "TO-001", BigDecimal.valueOf(70), Brand.TOYOTA, false)
        };
    }

    public Car[] getCars() {
        return cars;
    }

    public Car getCarById(UUID id){
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getId().equals(id)){
                return cars[i];
            }
        }
        return null;
    }
}
