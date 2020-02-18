package com.company.persons;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int height;
    private String eyesColor;
    private int weight;

    public Person(String name, int height, String eyesColor, int weight) {
        this.name = name;
        this.height = height;
        this.eyesColor = eyesColor;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public int getWeight() {
        return weight;
    }
}
