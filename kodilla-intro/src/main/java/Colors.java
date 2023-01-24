import java.util.Scanner;

public class Colors {
//String firstLetter;
    public static String getFirstLetter() {        // pobieram litere od użytkownika i ją zwracam letter
        Scanner scanner = new Scanner(System.in);
        String firstLetter = scanner.nextLine().trim().toUpperCase();
        return firstLetter;
    }

    public static String showColor() {        // na podstawie litery zamień ją na color i zwróć taki napis
        while (true) {
            System.out.println("Enter first letter from your color: ");
            String letter = Colors.getFirstLetter();
            switch (letter) {   //wybiera z opcji  tą co się zgadza (zamiast if)
                case "G":
                    return "Green";
                case "B":
                    return "Black";
                case "W":
                    return "White";
                case "P":
                    return "Pink";
                default:
                    System.out.println("I dont have color for the letter " + letter + " - try again");
            }
        }
    }

    public static String showColor2() {
        Colors color2 = new Colors();
        String letter2 = color2.showColor();
        String color = "";
        switch (letter2) {
            case "Green":
                color = "Green";
                break;
            case "Black":
                color = "Black";
                break;
            case "White":
                color = "White";
                break;
            case "Pink":
                color = "Pink";
                break;
        }
        return color;
    }
    public static void main(String[] args) {
        Colors color = new Colors();
        String userColor = color.showColor2();
        //String userLetter = "";
        System.out.println(" Twój kolor to : "+ userColor );
    }
}



