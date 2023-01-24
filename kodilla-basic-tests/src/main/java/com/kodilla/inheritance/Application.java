package com.kodilla.inheritance;

public class Application {

    public static void main(String[] args) {
        Car car = new Car(4, 5);
        car.turnOnLights();
        car.openDoors();

        Convertible convertible = new Convertible(4, 2);
        //convertible.closeRoof();
        //convertible.openRoof();
        //convertible.openDoors();
        convertible.turnOnLights();
        System.out.println(convertible.getSeats());
        convertible.displayNumberOfSeats();
    }
}
