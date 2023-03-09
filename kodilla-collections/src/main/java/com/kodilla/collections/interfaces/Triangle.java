package com.kodilla.collections.interfaces;

public class Triangle implements Shape {
double width;
double high;
double hypotenus;

public Triangle (double width, double high, double hypotenus) {
    this.high = high;
    this.width = width;
    this.hypotenus = hypotenus;
}

    @Override
    public double getArea() {
        return high * width /2 ;
    }

    @Override
    public double getPerimeter() {
        return width + high + hypotenus;
    }
}

