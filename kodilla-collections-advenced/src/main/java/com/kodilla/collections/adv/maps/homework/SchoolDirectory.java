package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Principal director1 = new Principal("Jan Kowal - ",  "LO Jawor");
        Principal director2 = new Principal("Franek Dolas - ", "SP5 Legnica");
        Principal director3 = new Principal("Ewa Kapec - ","SP2 Jawor");

        School schoolJawor = new School(Arrays.asList("Jacek", "Franek", "Gosia", "John", "Jesica" ));
        School schoolLegnica = new School(Arrays.asList("Grazyna", "Kaja", "Filip", "Gregor"));
        School schoolJaworSP = new School(Arrays.asList("Mark","Wojtek", "Michal"));


        Map<Principal, School> university = new HashMap<>();
        university.put(director1, schoolJawor);
        university.put(director2, schoolLegnica);
        university.put(director3, schoolJaworSP);

        for (Map.Entry<Principal, School> universityX : university.entrySet()) {
            System.out.println("dyrektor: " + universityX.getKey().getNameDirector() + "jednostka " + universityX.getKey().getNameSchool()
            + '\n' + "Number of students: " + universityX.getValue().getStudents().size());
        }
    }

}
// 1. stworzyc mape przyporzadkowujaca dyrektorow do szkoly
//czyli kluczem bedzie dyrektor a wartoscia szkola
// 2. nastepnie kilka wpisow dyrektorow z przypisana szkola
// 3. petla for-each wyswietl informacje o dyrektorach placowek,
//    nazwie szkoly ktora prowadza i liczbie wsszykich uczniw w danej szkole
// PRZYKLADOWO -  Dyr Franciszek Szkola nr 5 w Jaworze, liczba uczniow 320.


