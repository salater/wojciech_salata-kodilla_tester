import java.util.Scanner;

public class GetColor {

        public static String whatWord() {
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine().trim().toUpperCase();
            String color = null;
            switch (word) {
                case "G":
                    return "Green";
                case "B":
                    return "Black";
                case "W":
                    return "White";
                    //break;
                case "P":
                    return "Pink";
                default:
                    System.out.println("Nie mam koloru na literę" + color);
            }
            return color;

        /* public static String chackColor() {
            String result = null;
            switch(whatWord()) {
                case "G":
                    result = "Green";
                    break;
                case "B":
                    result = "Black";
                    break;
                case "W":
                    result = "White";
                    break;
                case "P":
                    result = "Pink";
                    break;

            }
            return result;
        } */
        }
    }

