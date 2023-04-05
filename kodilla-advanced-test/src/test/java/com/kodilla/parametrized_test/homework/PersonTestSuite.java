package com.kodilla.parametrized_test.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.testng.AssertJUnit.assertEquals;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_test.homework.BmiData#dataToBmi" )
    public void testBmiCalc(double heightInMeters, double weightInKilogram, String expected) {
        Person person = new Person(weightInKilogram, heightInMeters);
        assertEquals(expected, person.getBMI());
    }
}

