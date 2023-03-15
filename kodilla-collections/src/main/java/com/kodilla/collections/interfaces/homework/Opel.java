package com.kodilla.collections.interfaces.homework;

import java.util.Objects;
import java.util.Random;

public class Opel implements Car {
    private int maxspeed;
    private int engine;
    private int numberOfDoors;
    int speed = 0;
Random random = new Random();
    public Opel(int maxspeed, int engine, int numberOfDoors) {
        this.maxspeed = maxspeed;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;

    }

    @Override
    public void increaseSpeed() {

        speed = speed + random.nextInt(200);
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - random.nextInt(50);
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Opel{" +
                "maxspeed=" + maxspeed +
                ", engine=" + engine +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return maxspeed == opel.maxspeed && engine == opel.engine && numberOfDoors == opel.numberOfDoors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxspeed, engine, numberOfDoors);
    }
}


