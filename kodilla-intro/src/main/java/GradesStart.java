

public class GradesStart {

    public static void main(String[] args) {

        Grades grades = new Grades();
        grades.add(6);
        grades.add(3);
        grades.add(5);
        grades.add(1);
        grades.add(3);
        grades.add(4);
        grades.add(4);
        grades.add(5);
        grades.add(3);
        grades.add(2);
        int lastValue = grades.checkLast();

        double srednia = grades.wyliczSrednia();


    }
}

