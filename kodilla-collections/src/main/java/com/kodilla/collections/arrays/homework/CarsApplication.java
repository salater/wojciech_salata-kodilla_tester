package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.Random;

public class CarsApplication {
    private String color;
    private int numberOfDoors;
    private String name;
    private int speed;

    public void Car(String color, int numberOfDoors, String name, int speed){
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.name = name;
        this.speed = speed;
    }
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.displayCarInfo(car);

    }

    public static Car drawCar() {
                                         //Car ford = new Ford(2, 3, 5);
                                         //return ford;
    Random random = new Random();
    int drawnCarKind = random.nextInt(3);
    int f = drawCar().increaseSpeed(random);
    if (drawnCarKind == 0)
        return new Ford(f)
    }
}
