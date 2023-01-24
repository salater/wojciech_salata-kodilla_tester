package com.kodilla.inheritance.homework;


public class Person {

    String firstName;
    int age;
    // String job;
    Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }


    public static void main(String[] args) {

        Driver driver = new Driver(5000, "drive the car");
        Footballer footballer = new Footballer(14000, "Play the game");
        Doctor doctor = new Doctor(14000, "Treat the people");
        Informatic informatic = new Informatic(24500, "install Operating system");

        Person person1 = new Person("Wojtek", 42, footballer);
        //  Person person2 = new Person("Gienek", 36, "Footballer");
        //  Person person3 = new Person("Marek", 65, "Doctor");
        //  Person person4 = new Person("Karol", 18, "Informatic");
        // System.out.println("Responsibilities of is: ");
    }
}


