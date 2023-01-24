package com.kodilla.inheritance.homework.SystemOperating;

public class Square extends Shape {

    public Square(){
        super(3);
    }

    @Override
    public void area() {
        int areaS = sideA*sideA;
       System.out.println("The area of the square is: " + areaS);
    }
    @Override
    public void circuit() {
        int circuitS = 4*sideA;
        System.out.println("The circuit of the square is: " + circuitS);
    }
}
