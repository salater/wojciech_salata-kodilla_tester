package com.kodilla.basic_assertion;

import com.kodilla.inheritance.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuit {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.suma(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubstration() {
        Calculator calculatorS = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculatorS.substraction(a, b);
        assertEquals(-3, subResult);
    }
@Test
    public void testPower() {
        Calculator calculatorP = new Calculator();
        double a = -2.0;
        double b = -1.0;
        double delta =0.01;
        double powResult = calculatorP.power(a, b);
        assertEquals(-0.5, powResult, delta);

}

}
