package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int maxspeed;
    private int engine;
    private int numberOfDoors;
    int speed = 0;

    public Opel(int maxspeed, int engine, int numberOfDoors, int speed) {
        this.maxspeed = maxspeed;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
        this.speed = speed;

    }

    @Override
    public void increaseSpeed() {
        speed = speed + 100;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 40;
    }
}
