package com.kodilla.collections.adv.maps.homework;

import java.util.List;
import java.util.Objects;

public class School {
    public List<String> students;

    public School(List<String> students) {
        this.students = students;
    }

    public List<String> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(students, school.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}






