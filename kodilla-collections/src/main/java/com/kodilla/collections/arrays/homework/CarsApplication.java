package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static Car drawCar() {
        // metoda tworzy losowy samochód z losowym przyspieszeniem
        // losuje samochody jakie ? te co miałem w zadaniu z wyscigiem ?
        // przyspieszenie to poprostu random liczby np od 10-100 ?

        Random random = new Random();    // wylosowano samochody
        int whatCar = random.nextInt(3);
        //double a = getRandomSize();
        if (whatCar == 0)
            return new Ford(random.nextInt(300), 3, 5);
        else if (whatCar == 1)
            return new Kia(random.nextInt(200), 2, 4);
        else {
            return new Opel(random.nextInt(250), 1, 3);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            //System.out.println(car);
            CarUtils.displayCar(car);


    }

}

