package com.kodilla.inheritance.homework;

public class Footballer extends Job{

    public Footballer(double salary, String responsibilities, String nameOfJob) {
        super(salary, responsibilities, nameOfJob);
        System.out.println("Responsibilities of the " +nameOfJob+" is: " + responsibilities);

    }
}
