package com.kodilla.collections.interfaces;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Triangle{" + "width=" + width + ", high=" + high + ", hypotenus=" + hypotenus + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.width, width) == 0
                && Double.compare(triangle.high, high) == 0
                && Double.compare(triangle.hypotenus, hypotenus) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, high, hypotenus);
    }
}

