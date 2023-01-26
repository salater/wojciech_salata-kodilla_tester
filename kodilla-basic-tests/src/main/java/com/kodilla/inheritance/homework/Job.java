package com.kodilla.inheritance.homework;

public abstract class Job {
    private double salary;
    private String responsibilities;
    private String nameOfJob;


    public Job(double salary, String responsibilities, String nameOfJob) {
        this.salary = salary;
        this.responsibilities = responsibilities;
        this.nameOfJob = nameOfJob;

    }

    public String getNameOfJob() {
        return nameOfJob;
    }
}
