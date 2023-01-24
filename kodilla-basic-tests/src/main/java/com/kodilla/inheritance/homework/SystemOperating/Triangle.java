package com.kodilla.inheritance.homework.SystemOperating;

public class Triangle extends Shape{

    public  Triangle(int sideA, int sideB, int sideC, int high){
        this.sideA = sideA;
        this.high = high;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void area() {
        double areaT = sideA*high/2;
        System.out.println("The area of triangle is: " + areaT);
    }

    @Override
    public void circuit() {
        double circuitC = sideA+sideB+sideC;
        System.out.println("The circuit of triangle is: " + circuitC);
    }
}
