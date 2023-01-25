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

        Driver driver = new Driver(5000, "drive the car", "driver");
        Footballer footballer = new Footballer(14000, "Play the game", "footballer");
        Doctor doctor = new Doctor(14000, "Treat the people", "doctor");
        Informatic informatic = new Informatic(24500, "install Operating system", "informatic");

        Person person1 = new Person(" Wojtek ", 42, footballer);
        System.out.println("Firts person is: "+ person1.firstName+ " he is a "+footballer);
        Person person2 = new Person(" Gienek ", 36, driver);
        Person person3 = new Person(" Marek ", 65, doctor);
        Person person4 = new Person(" Karol ", 18, informatic);

    }
}


