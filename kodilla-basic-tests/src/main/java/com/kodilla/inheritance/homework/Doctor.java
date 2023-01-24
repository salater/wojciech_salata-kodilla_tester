package com.kodilla.inheritance.homework;

public class Doctor extends Job {
    public Doctor(double salary, String responsibilities) {
        super(salary, responsibilities);
        System.out.println("Responsibilities of Doctor is: " + responsibilities);
    }
}
