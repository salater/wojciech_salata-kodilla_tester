package zadania;

import java.util.Scanner;

public class AeroSquer {

    public static void main(String[] args) {

        int a = 0;
        while (a <= 0) {
            System.out.println("Podaj wartość boku a:");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();

            if (a <= 0) {
                System.out.println("Miara boku musi być większa od zera !");

            } else {
                int are = a * a;
                System.out.println("Pole kwadratu wynosi: " + are);
                int perimetr = 4*a;
                System.out.println("Obwód kwadratu o boku "+a+" wyosi " + perimetr);
                return;
            }
        }
    }
}



