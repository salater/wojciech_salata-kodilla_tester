package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int maxspeed;
    private int engine;
    private int numberOfDoors;
    private  int speed=0;

    public Ford(int maxspeed, int engine, int numberOfDoors) {
        this.maxspeed = maxspeed;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;

    }
    @Override
    public void increaseSpeed() {
        speed = speed + 60;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 30;
    }

    public int getSpeed(){
        return speed;
    }
}
