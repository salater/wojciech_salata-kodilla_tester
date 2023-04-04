package com.kodilla.stream.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Maksym", new Teacher("Janowski")));
        students.add(new Student("Walasek", null));
        students.add(new Student("Darek", new Teacher("Sledz")));

        for (Student team : students) {
            Optional<Teacher> teacherIs = Optional.ofNullable(team.getTeacher());
            String name = teacherIs.orElse(new Teacher("undefined")).getName();
            System.out.println(("student: " + team.getName() + " , teacher: " + name));
        }
    }
}

