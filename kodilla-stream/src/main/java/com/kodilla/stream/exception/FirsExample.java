package com.kodilla.stream.exception;

public class FirsExample {
    public static void main(String[] args) {

        // String userName = "Willi Wonka";
        String userName = "John";
        String[] nameParts = userName.split(" ");
        System.out.println("FirstName: " + nameParts[0]);
        System.out.println("LastName: " + nameParts[1]);
    }
}
