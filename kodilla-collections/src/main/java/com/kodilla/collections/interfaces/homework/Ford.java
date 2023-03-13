package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int maxspeed;
    private int engine;
    private int numberOfDoors;
    private  int speed;

    public Ford(int maxspeed, int engine, int numberOfDoors, int speed) {
        this.maxspeed = maxspeed;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
        this.speed = speed;

    }
    @Override
    public void increaseSpeed() {
        speed = speed + 60;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 30;
    }
}
