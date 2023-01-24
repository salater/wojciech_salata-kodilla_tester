package com.kodilla.inheritance.homework.SystemOperating;

public abstract class Shape {        //kształt !!!!! klasa abstarkcyjna ktora zawiera
    // kontruktor obiektu kształt
    public int sideA;
    public int sideB;
    public int sideC;
    public int high;
    public int radius;

    public Shape(int sideA) {
        this.sideA = sideA;

    }

    public Shape() {

    }

    public abstract void area();

    public abstract void circuit();
}
