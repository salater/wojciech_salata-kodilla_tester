package com.kodilla.collections.adv.maps.homework;

public class Principal {
    private String nameDirector;
    private String nameSchool;

    public Principal(String nameDirector, String nameSchool) {
        this.nameDirector = nameDirector;
        this.nameSchool = nameSchool;
    }
    public String getNameDirector() {
        return nameDirector;
    }
    public String getNameSchool() {
        return nameSchool;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "nameDirector='" + nameDirector + '\'' +
                ", nameSchool='" + nameSchool + '\'' +
                '}';
    }
}