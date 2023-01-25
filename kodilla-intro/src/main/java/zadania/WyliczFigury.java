package zadania;

import java.util.Scanner;

public class WyliczFigury {


    public static void main(String[] args) {
        System.out.println("Podaj Bok a kwadratu:");
        Scanner scanner = new Scanner(System.in);

        Square square = new Square(scanner.nextInt());
        int poleS = square.area();
        System.out.println("Pole kwadratu to : " + poleS);

        System.out.println("Podaj bok a prostokąta:");
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Podaj bok b prostokąta:");
        Scanner scanner2 = new Scanner(System.in);

        Rectangle rectangle = new Rectangle(scanner1.nextInt(), scanner2.nextInt());
        int poleR = rectangle.area();
        System.out.println("Pole prostokąta wynosi: " + poleR);

    }
}