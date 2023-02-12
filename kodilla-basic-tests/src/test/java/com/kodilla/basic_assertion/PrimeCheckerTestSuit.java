package com.kodilla.basic_assertion;

import com.kodilla.inheritance.basic_assertion.PrimeChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PrimeCheckerTestSuit {
    private PrimeChecker checker = new PrimeChecker();
    private static int count = 0;

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(14);
        count++;
        //checker.incrementCount();
        //System.out.println("Count " + checker.getCount());
        System.out.println("Test nr:  " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingNotPrimeNumber() {
        // PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(13);
        count++;
       // checker.incrementCount();
       // System.out.println("Count " + checker.getCount());
        System.out.println("Test nr:  " + count);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingTwo() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(2);
        count++;
       // checker.incrementCount();
       // System.out.println("Count " + checker.getCount());
        System.out.println("Test nr:  " + count);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(1);
        count++;
       // checker.incrementCount();
       // System.out.println("Count " + checker.getCount());
        System.out.println("Test nr:  " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(0);
        count++;
        //checker.incrementCount();
        //System.out.println("Count " + checker.getCount());
        System.out.println("Test nr:  " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(-6);
        count++;
        //checker.incrementCount();
        //System.out.println("Count " + checker.getCount());
        System.out.println("Test nr:  "+ count);
        assertFalse(result);
    }
}
