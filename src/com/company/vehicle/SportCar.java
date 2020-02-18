package com.company.vehicle;

public class SportCar extends Vehicle {
    private String transmission;

    public SportCar(String brand, String model, String color, int doors, int width, int length, Engine engine, String transmission) {
        super(brand, model, color, doors, width, length, engine);
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }
}
