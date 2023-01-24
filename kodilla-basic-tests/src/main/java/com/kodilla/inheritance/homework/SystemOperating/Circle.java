package com.kodilla.inheritance.homework.SystemOperating;


import com.kodilla.inheritance.homework.SystemOperating.Shape;

public class Circle extends Shape {
    public  Circle(int radius){
        this.radius = radius;
        //double pi=Math.PI;
    }
    @Override
    public void area() {
        double areaC = Math.PI*radius*radius;
        System.out.println("The area of circle is: " + areaC);
    }

    @Override
    public void circuit() {
        double circuitC = 2*Math.PI*radius;
        System.out.println("The circuit of circle is: " + circuitC);
    }
}
