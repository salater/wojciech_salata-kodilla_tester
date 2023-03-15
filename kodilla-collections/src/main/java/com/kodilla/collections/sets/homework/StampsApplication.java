package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("dragon from Wawel", "52x52", true));
        stamps.add(new Stamp("BigBen", "8x8", true));
        stamps.add(new Stamp("Fish", "8x8",false));
        stamps.add(new Stamp("longDog", "15x89",false));
        stamps.add(new Stamp("longDog", "15x89",false));

        System.out.println("There should be 4 stamps, and is ? :" + stamps.size());

        for (Stamp stampss: stamps) {
            System.out.println(stampss);
        }
    }
}
