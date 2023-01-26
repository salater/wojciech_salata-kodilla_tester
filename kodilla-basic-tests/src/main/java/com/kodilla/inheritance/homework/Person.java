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

        Person wojtek = new Person(" Wojtek ", 42, footballer);
        Person gienek = new Person(" Gienek ", 36, driver);
        Person marek = new Person(" Marek ", 65, doctor);
        Person karol = new Person(" Karol ", 18, informatic);
        System.out.println("First person is: "+ wojtek.firstName+ " he is a "+ footballer.getNameOfJob());
        System.out.println("Second person is"+ gienek.firstName + " he is a "+driver.getNameOfJob());
        System.out.println("Third person is"+ marek.firstName + " he is a "+doctor.getNameOfJob());
        System.out.println("Fourth person is"+ karol.firstName + " he is a "+informatic.getNameOfJob());

    }
}


