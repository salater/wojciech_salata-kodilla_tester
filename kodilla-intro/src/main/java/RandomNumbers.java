
import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        //Utwórz klasę RandomNumbers, w której będzie istnieć metoda losująca liczby z zakresu 0-30,
        // tak długo, aż ich suma przekroczy 5000. Napisz dwie metody zwracające
        // największą i najmniejszą wylosowaną wartość.

        Random liczba = new Random();    //randomowe losowanie liczby

        int liczbaLosowana = 0;
        int liczbaMax = 0;
        int liczbaMin = 0;
        int suma = 0;

        do {
            liczbaLosowana = liczba.nextInt(31);
            suma = suma + liczbaLosowana;

            System.out.println("Element losowania " + liczbaLosowana);

            if (liczbaLosowana >= liczbaMax) {
                liczbaMax = liczbaLosowana;
            } else if(liczbaLosowana <= liczbaMin){
                liczbaMin = liczbaLosowana;
            }

        } while (suma < 5000);

        System.out.println("Suma liczb: " + suma);
        System.out.println("Liczba max. " + liczbaMax);
        System.out.println("Liczba min.: " + liczbaMin);
    }
}
