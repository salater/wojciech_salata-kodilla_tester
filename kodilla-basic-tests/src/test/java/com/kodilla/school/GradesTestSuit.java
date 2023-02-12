package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static com.kodilla.inheritance.basic_assertion.ResultChecker.assertEquals;

public class GradesTestSuit {
    @Test
    public void shouldHaveZeroLength() {
        Grades grades = new Grades();
        int[] values = grades.getValues();
        assertEquals(0, values.length,1);
    }
    @Test
    public void shouldAddTwoElementsToArray() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);

        int[] values = grades.getValues();
        assertEquals(2, values.length,0);
        assertEquals(4, values[0],1);
        assertEquals(2, values[1],1);
    }
    @Test
    public void shouldCalculateAverage() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(5);

       //assertEquals(3.55, grades.getAverage(), 0.01);

         assertEquals(3.9, grades.getAverage(), 0.01);
    }
@Test
    public void shouldRturnAvarageEqualsZeroIsArrayIsEmpty() {
        Grades grades = new Grades();
        assertEquals(2, grades.getAverage(),0.0001);
}
}
