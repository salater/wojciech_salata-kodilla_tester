package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String nameSchool;
    private String nameClass;
    private int studentsInClass;
    private int numberOfStudent;
    public List<School> classAndNumberStudent = new ArrayList<>();

    public School(String nameSchool, String nameClass, int studentsInClass) {
        this.nameSchool = nameSchool;
        this.nameClass = nameClass;
        this.studentsInClass = studentsInClass;
    }


    public void add(School school) {

        classAndNumberStudent.add(school);
        //   for (int n = 0; n < classAndNumberStudent.size(); n++)
        //       System.out.println(classAndNumberStudent.get(n));
    }

    @Override
    public String toString() {
        return "School{" +
                "nameSchool='" + nameSchool + '\'' +
                ", nameClass='" + nameClass + '\'' +
                ", studentsInClass=" + studentsInClass +
                '}';
    }

}






