import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj liczbę:");
            int liczba = scanner.nextInt();
            //int even = liczba%2;
            if (liczba % 2 == 0) {
                System.out.println(liczba + " jest liczbą parzystą:");

            } else {
                System.out.println(liczba + " jest liczbą nieparzystą");
            }

            System.out.println("Aby zakończyć wpisz END, sprawdź kolejną liczbę wciśnij ENTER");
            String end = scanner1.nextLine();
            String finish = "end";
            if (end.equals(finish))
                return;
        }

    }
}

