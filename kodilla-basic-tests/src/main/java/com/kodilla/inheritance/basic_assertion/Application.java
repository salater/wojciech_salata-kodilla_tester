package com.kodilla.inheritance.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.suma(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult,1);
        if (correct) {
            System.out.println("Metoda dodawania jest prawidłowa");
        } else {
            System.out.println("Metoda dodawania jest błędna !");
        }

        int subResult = calculator.substraction(a, b);
        correct = ResultChecker.assertEquals(-5, subResult,1);
        if (correct) {
            System.out.println("Metoda odejmowania jest prawidłowa");
        } else {
            System.out.println("Metoda odejmowania jest błędna !");
        }

        double powResult = calculator.power(a, b);
        correct = ResultChecker.assertEquals(390625, powResult,1);
        if (correct) {
            System.out.println("Metoda podnoszenia do kwadratu jest prawidłowa");
        } else {
            System.out.println("Metoda podnoszenia do kwadratu jest błędna !");
        }
    }
}
