import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Podaj rok ");
        Scanner years = new Scanner(System.in);
       int year = years.nextInt() ;

        if(year%4==0 && year%100==0 && year%400==0) {
            System.out.println("Rok " + year + " jest przestępny");
        } else {
            System.out.println("Rok " + year + " nie jest przestępny");
        }

    }
}
