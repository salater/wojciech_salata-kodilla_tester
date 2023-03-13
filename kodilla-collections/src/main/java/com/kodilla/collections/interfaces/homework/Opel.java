package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int maxspeed;
    private int engine;
    private int numberOfDoors;
    int speed = 0;

    public Opel(int maxspeed, int engine, int numberOfDoors) {
        this.maxspeed = maxspeed;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;

    }

    @Override
    public void increaseSpeed() {
        speed = speed + 100;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 40;
    }

    public int getSpeed() {
        return speed;
    }
}


