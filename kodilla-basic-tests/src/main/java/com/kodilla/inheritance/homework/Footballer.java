package com.kodilla.inheritance.homework;

public class Footballer extends Job{

    public Footballer(double salary, String responsibilities) {
        super(salary, responsibilities);
        System.out.println("Responsibilities of the Footballer is: " + responsibilities);
    }
}
