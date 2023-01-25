package zadania;

import java.util.Scanner;

public class Sprwadzenie {

        public static void main(String[] args) {

            System.out.println("Podaj liczbę:");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Liczba " + number + " jest ujemna");
            }
            if (number == 0) {
                System.out.println("Liczba " + number + " jest równa zero");
            } if(number > 0) {

                System.out.println("Liczba " + number + " jest wieksza od zera");
            }
        }
    }


