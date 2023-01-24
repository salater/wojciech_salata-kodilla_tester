package com.kodilla.inheritance.homework.SystemOperating;

public class ApplicationShape {
    public static void main(String[] args) {

Square square = new Square();
square.area();
square.circuit();

Circle circle = new Circle(8);
circle.area();
circle.circuit();

Triangle triangle = new Triangle(4,3,6,3);
triangle.area();
triangle.circuit();


    }
}

