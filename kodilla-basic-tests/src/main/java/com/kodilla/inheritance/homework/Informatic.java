package com.kodilla.inheritance.homework;

public class Informatic extends Job{

    public Informatic(double salary, String responsibilities) {
        super(salary, responsibilities);
        System.out.println("Responsibilities of Informatics is: " + responsibilities);

    }
}
