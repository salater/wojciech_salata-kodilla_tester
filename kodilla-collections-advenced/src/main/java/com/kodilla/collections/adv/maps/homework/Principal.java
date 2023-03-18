package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Principal {
    private String name;
    private String lastName;
    private int age;
    private String sex;
    public List<Principal> directorOfSchool = new ArrayList<>();

    public Principal(String name, String lastName, int age, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public void add(Principal principal) {
        directorOfSchool.add(principal);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", directorOfSchool=" + directorOfSchool +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return age == principal.age && Objects.equals(name, principal.name) && Objects.equals(lastName, principal.lastName) && Objects.equals(sex, principal.sex) && Objects.equals(directorOfSchool, principal.directorOfSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, sex, directorOfSchool);
    }
}
