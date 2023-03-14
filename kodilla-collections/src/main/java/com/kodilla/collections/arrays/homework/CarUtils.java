package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {

    public static void displayCar(Car car) {

        System.out.println("Model of Car: " + getModelCar(car) + "speed: " + car.getSpeed());
    }

    public static String getModelCar(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Kia)
            return "Kia";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown Car name";
    }
    public static void getInfoCar() {
        Car autospeed = new Car() {
            @Override
            public int getSpeed() {
                return 0;
            }
            @Override
            public void increaseSpeed() {
            }
            @Override
            public void decreaseSpeed() {
            }
        }
    }
}


