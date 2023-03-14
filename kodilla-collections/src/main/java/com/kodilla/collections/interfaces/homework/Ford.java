package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Ford implements Car{
    private int maxspeed;
    private int engine;
    private int numberOfDoors;
    private  int speed=0;
    Random random = new Random();
    public Ford(int maxspeed, int engine, int numberOfDoors) {
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

    public int getSpeed(){
        return speed;
    }
}
