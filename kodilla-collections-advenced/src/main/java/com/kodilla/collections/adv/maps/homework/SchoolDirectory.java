package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Principal director1 = new Principal("Jan", "Kowal", 42, "Man");
        Principal director2 = new Principal("Franek", "Diaz", 40, "Man");
        Principal director3 = new Principal("Ewa", "Kowal", 36, "Woman");
        director1.add(director1);
        director2.add(director2);
        director3.add(director3);

        School school2 = new School("sp5 jawor", "klasa 8b", 20);
        School school11 = new School("LO jawor", "klasa 4a", 30);
        School school12 = new School("LO jawor", "klasa 4b", 28);
        school2.add(school2);
        school11.add(school11);
        school12.add(school12);


        Map<Principal, School> university = new HashMap<>();
        university.put(director1, school2);
        university.put(director2, school11);
        university.put(director3, school12);

        for (Map.Entry<Principal, School> universityX : university.entrySet()) {
            System.out.println("dyrektor: " + universityX.getKey() + "jednostka " + universityX.getValue());
        }
    }

}
// 1. stworzyc mape przyporzadkowujaca dyrektorow do szkoly
//czyli kluczem bedzie dyrektor a wartoscia szkola
// 2. nastepnie kilka wpisow dyrektorow z przypisana szkola
// 3. petla for-each wyswietl informacje o dyrektorach placowek,
//    nazwie szkoly ktora prowadza i liczbie wsszykich uczniw w danej szkole
// PRZYKLADOWO -  Dyr Franciszek Szkola nr 5 w Jaworze, liczba uczniow 320.


