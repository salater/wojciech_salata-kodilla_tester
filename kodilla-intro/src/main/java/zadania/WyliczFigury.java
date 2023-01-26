package zadania;

public class WyliczFigury {


    public static void main(String[] args) {

        Square square = new Square();
        int poleS = square.area();


        Rectangle rectLetterA = new Rectangle("Podaj bok a prostokąta: ");
        int letterA = rectLetterA.letterA();
        Rectangle rectLetterB = new Rectangle("Podaj bok b prostokąta: ");
        int letterB = rectLetterB.letterA();

        Rectangle rectangle = new Rectangle(letterA, letterB);
        int poleR = rectangle.area();
        System.out.println("Pole prostokąta wynosi: " + poleR);

    }
}