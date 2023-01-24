public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        int suma = 0;
        User[] student = new User[3];      // tworze tablicę userów w  liczbie 10
        student[0] = new User("Tomek", 55);
        student[1] = new User("Franek", 24);
        student[2] = new User("Onufry", 102);

        for (int i = 0; i < student.length; i++) {
            suma += student[i].age;
            if (student[i].age < suma / student.length) {
                System.out.println("Student z wiekiem poniżej średniej: ");
                System.out.print("imie: " + student[i].name + ", ");
                System.out.println("wiek: " + student[i].age);

            }
/*
    public static void main(String[] args) {
        User[] student = new User[3];

        String[] name = {"Franek", "Bolek", "Zuza"};
        int[] age = {10, 65, 23,};
        int suma =0;
        int srednia = 0;
        {
            int i = 0;
            while (i < age.length) {
                suma += age[i];
                srednia = suma/ age.length;
                i++;
            }
        }
*/
        /*
        for (int i = 0; i < student.length; i++) {
            student[i] = new User();
            student[i].name = name[i];
            student[i].age = age[i];

            if (age[i] < srednia) {

                System.out.print("imię: " + student[i].name);
                System.out.println(", Wiek: " + student[i].age);

            }

        }
        */



        }
        System.out.println("Rozmiar tablicy: " + student.length);
    }
}


