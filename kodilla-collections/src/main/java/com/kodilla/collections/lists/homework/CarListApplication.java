package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Kia(250, 3, 2));
        cars.add(new Ford(234, 2, 4));
        cars.add(new Opel(222, 3, 3));
        cars.add(new Ford(400, 5, 5));

        cars.remove(0);                                          // remowe Kia
        Car car = new Ford(234, 2, 4);
        cars.remove(car);                                              //wywali auto Ford o wlasciwosciach 234,2,4
        System.out.println("How many cars ?: " + cars.size());
        for (Car carss : cars) {
            CarUtils carUtils = new CarUtils();
            System.out.println("Auto: " + carss);

        }

    }
}
