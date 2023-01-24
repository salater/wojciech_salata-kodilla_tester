package com.kodilla.inheritance.homework.SystemOperating;

public class OperatingSystem {


    private int yyyy;
    private String name;

    public OperatingSystem(int yyyy, String name) {
        this.yyyy = yyyy;
        this.name = name;
    }

    public void turnOn() {

        System.out.println("System "+ name +" opublikowano  w : " + yyyy);
    }

    public void turnOff() {

    }

}
