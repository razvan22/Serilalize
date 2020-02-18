package com.company.vehicle;

import java.io.Serializable;

public abstract class Vehicle implements Serializable {
    private String brand;
    private String model;
    private String color;
    private int doors;
    private int width;
    private int length;

    private Engine engine;

    public Vehicle(String brand, String model, String color, int doors, int width, int length, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.width = width;
        this.length = length;
        this.engine = engine;
    }

    public String getBrand() {

        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public Engine getEngine() {
        return engine;
    }
}
