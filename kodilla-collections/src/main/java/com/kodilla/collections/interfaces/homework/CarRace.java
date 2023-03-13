package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car ford = new Ford(200, 2, 5);
        doRace(ford);
        System.out.println("Speed Ford: " + ford.getSpeed());
        Car opel = new Opel(190, 1, 2);
        doRace(opel);
        System.out.println("Speed Opel: " + opel.getSpeed());
        Car kia = new Kia(150, 3, 4);
        doRace(kia);
        System.out.println("Speed Kia: " + kia.getSpeed());
    }

    static int doRace(Car car) {
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }
        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }
        return car.getSpeed();
    }
}
