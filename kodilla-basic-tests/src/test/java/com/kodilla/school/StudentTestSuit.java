package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTestSuit {
    @Test
    public void shouldCalculateCorrectAveragesIfValuesAreRange() {
        Student student = new Student("Wojtass");
        student.addGeografyGrade(5);
        student.addGeografyGrade(4);
        student.addGeografyGrade(2);

        student.addHistoryGrade(1);
        student.addHistoryGrade(5);

        double geogrfyAverage = student.getGeografyAvarage();
        double historyAverage = student.getHistoryAverage();
        double physicsAverage = student.getPhysicsAverage();
        double mathsAverages = student.getMathAverage();

        assertEquals(3.66, geogrfyAverage, 0.01);


    }
}
