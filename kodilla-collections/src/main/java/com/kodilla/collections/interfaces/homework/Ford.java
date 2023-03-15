package com.kodilla.collections.interfaces.homework;

import java.util.Objects;
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

    @Override
    public String toString() {
        return "Ford{" +
                "maxspeed=" + maxspeed +
                ", engine=" + engine +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return maxspeed == ford.maxspeed && engine == ford.engine && numberOfDoors == ford.numberOfDoors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxspeed, engine, numberOfDoors);
    }
}
