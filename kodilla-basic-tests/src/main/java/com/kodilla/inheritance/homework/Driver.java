package com.kodilla.inheritance.homework;

public class Driver extends Job{
    public Driver(double salary, String responsibilities) {
        super(salary, responsibilities);
        System.out.println("Responsibilities of Driver is: " + responsibilities);
    }
}
