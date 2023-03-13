package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car ford = new Ford(200, 2, 5, 60);
        System.out.println();
        Car opel = new Opel(190, 1, 2, 50);
        System.out.println();
        Car kia = new Kia(150, 3, 4, 45);
        System.out.println();
    }
    int doRace() {
        return 0;
    }
}
