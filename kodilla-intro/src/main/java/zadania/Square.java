package zadania;

import java.util.Scanner;

public class Square {

    private int a;

   // public Square() {
   // }

    public int area() {

        while (a <= 0) {
            System.out.print("Podaj Bok a kwadratu:");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            if (a <= 0) {
                System.out.println("Bok a kwadratu  musi być większy od zera");
            }
        }
        int pole = a * a;
        System.out.println("Pole kwadratu wynosi: " + pole);
        return pole;


    }


}

