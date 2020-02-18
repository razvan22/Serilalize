package com.company.vehicle;

import java.io.Serializable;

public class Engine implements Serializable {
    private int cylinders;
    private int  hp;
    private String model;

    public Engine(int cylinders, int hp, String model) {
        this.cylinders = cylinders;
        this.hp = hp;
        this.model = model;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getHp() {
        return hp;
    }

    public String getModel() {
        return model;
    }
}
