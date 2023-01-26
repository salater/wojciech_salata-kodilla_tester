package zadania;

import java.util.Scanner;

public class Rectangle {
    private int a;
    private int b;
    private String sideA;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int area() {
        int pole = a * b;
        return pole;
    }

    public Rectangle(String sideA) {
this.sideA = sideA;
    }
    public int letterA() {

        int a = 0;
        while (a <= 0) {
            System.out.print(sideA);
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();

            if (a <= 0) {
                System.out.println("Miara boku musi być większa od zera");
            }
        }
        return a;
    }
}












