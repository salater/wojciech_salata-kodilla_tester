package com.kodilla.school;

public class Student {

    private String name;
    private Grades maths;
    private Grades physics;
    private Grades geografy;
    private Grades history;

    public Student(String name) {
        this.name = name;
        this.maths = new Grades();
        this.physics = new Grades();
        this.geografy = new Grades();
        this.history = new Grades();
    }

    public void addMathGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.maths.add(grade);
        }
    }

    public void addPhysicsGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.physics.add(grade);
        }
    }

    public void addGeografyGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.geografy.add(grade);
        }
    }

    public void addHistoryGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.history.add(grade);
        }
    }

    public double getMathAverage() {
        return this.maths.getAverage();
    }

    public double getPhysicsAverage() {
        return this.physics.getAverage();
    }

    public double getGeografyAverage() {
        return this.geografy.getAverage();
    }

    public double getHistoryAverage() {
        return this.history.getAverage();
    }

    public double getAverage() {
        double sum = this.geografy.getAverage() + this.history.getAverage() + this.physics.getAverage() + this.maths.getAverage();
        return sum / 4;
        //return -1;
    }
}
