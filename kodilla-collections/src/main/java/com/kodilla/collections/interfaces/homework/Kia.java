package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {
    private int maxspeed;
    private int engine;
    private int numberOfDoors;
    private int speed;

    public Kia(int maxspeed, int engine, int numberOfDoors, int speed) {
        this.maxspeed = maxspeed;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
        this.speed = speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 20;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 20;
    }
}
