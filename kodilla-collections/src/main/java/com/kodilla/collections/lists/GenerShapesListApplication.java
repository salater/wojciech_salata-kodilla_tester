package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.LinkedList;
import java.util.List;

public class GenerShapesListApplication {
    public static void main(String[] args) {
        Car car = new Ford(2,4,6);
        car.increaseSpeed();
        List<Shape> shapes = new LinkedList<>();
        Square square = new Square(10.0);
        shapes.add(square);
        shapes.add(new Circle(5.0));
        shapes.add(new Triangle(4, 5, 6));

        shapes.remove(1);
        shapes.remove(square);

        Triangle triangle = new Triangle(4,5,6);
        shapes.remove(triangle);

        System.out.println("rozmar: " + shapes.size());
        for (Shape shape : shapes) {

            System.out.println(shape + ", area: " + shape.getArea() + ", perimeter: " + shape.getPerimeter());
        }


        List<Car> cars = new LinkedList<>();
        cars.add(new Opel(230,4,5));
        cars.add(new Kia(200,3,5));
        cars.add(new Ford(290,5,2));
        cars.add(new Ford(190,2,5));

        for (Car carr :cars) {
            System.out.println("---------------------------------------");
            System.out.println(carr + ", maxspeed: " + car.getSpeed());
        }

    }
}
