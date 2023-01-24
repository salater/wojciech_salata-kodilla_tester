// stworzyc tablice ocen ucznia w ilosci 10
//stworzyc metode przekazaującą w argumence ocenę do tablicy
// podac ostatnio dodaną ocene
// wyliczyc srednia artymetyczna ocen ucznia

public class Grades {
    int[] grades;

    int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {

        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int checkLast() {
        int lastValue = this.grades[this.size - 1];
        System.out.println("Otatnia ocena to: " + lastValue);
        return lastValue;
    }

    public double wyliczSrednia() {
        double suma = 0.0;
        double srednia = 0.0;
        for (int i = 0; i < this.size; i++) {
            suma = suma + this.grades[i];
        }
        System.out.println("suma liczona " + suma);

        srednia = suma / size;
        System.out.println("Średnia ocen ucznia to: " + srednia);
        return srednia;
    }
}




