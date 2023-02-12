package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTestSuit {
    @Test
    public void shouldCalculateCorrectAveragesIfValuesAreRange() {
        Student student = new Student("Wojtass");
        student.addGeografyGrade(-8);
        student.addGeografyGrade(4);
        student.addGeografyGrade(2);

        student.addHistoryGrade(1);
        student.addHistoryGrade(5);

        double geogrfyAverage = student.getGeografyAverage();
        double historyAverage = student.getHistoryAverage();
        double physicsAverage = student.getPhysicsAverage();
        double mathsAverages = student.getMathAverage();

        assertEquals(3.66, geogrfyAverage, 0.01);

    }
    @Test
    public void shouldCalculateAvaragesIfValuesAreOutsideRange(){
        Student student = new Student("Marek");
        student.addGeografyGrade(-2);
        student.addGeografyGrade(4);
        student.addGeografyGrade(8);

        student.addMathGrade(0);

        student.addPhysicsGrade(19);
        student.addPhysicsGrade(3);
        student.addPhysicsGrade(3);

        double geografyAverage = student.getGeografyAverage();
        double historyAverage = student.getHistoryAverage();
        double mathsAverage = student.getMathAverage();
        double physicsAverage = student.getPhysicsAverage();

        assertEquals(4, geografyAverage, 0.01);
        assertEquals(0, historyAverage, 0.01);
        assertEquals(0, mathsAverage, 0.01);
        assertEquals(3, physicsAverage, 0.01);
        }
        @Test
    public void averageShouldBeZeroIfStudentDontHaveGrades(){
        Student student = new Student("Marian");
        assertEquals(0, student.getAverage(), 0.0001);
        }
        @Test
    public void shouldCalculateStudentAverage() {
        Student student = new Student("Marian");
        student.addGeografyGrade(4);
        student.addGeografyGrade(4);
        student.addGeografyGrade(2);
        student.addGeografyGrade(-2);
        student.addGeografyGrade(4);
        student.addGeografyGrade(8);

        student.addHistoryGrade(1);
        student.addHistoryGrade(5);

        student.addMathGrade(0);

        student.addPhysicsGrade(19);
        student.addPhysicsGrade(3);
        student.addPhysicsGrade(3);
        assertEquals(2.375, student.getAverage(), 0.001);
        }
    }

