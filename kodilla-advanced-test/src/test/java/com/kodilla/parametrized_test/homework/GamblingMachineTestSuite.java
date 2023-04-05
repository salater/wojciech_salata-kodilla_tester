package com.kodilla.parametrized_test.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Set;

import static org.testng.Assert.assertEquals;

public class GamblingMachineTestSuite {
    public GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/homeGambling.csv", numLinesToSkip = 1)
    public void testHowManyWins(Set<Integer> userNumbers, int expected) throws InvalidNumbersException {
        int now = gamblingMachine.howManyWins(userNumbers);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/homeGambling.csv", numLinesToSkip = 1)
    public void testGenerataComputerNumbers(int generates) {
        for(int i = 0;  i < generates; i ++) {
            Set<Integer> numbers = gamblingMachine.generateComputerNumbers();
            assertEquals(6, numbers.size(), "Wrong");
        }
    }

   // @ParameterizedTest
   // @CsvFileSource(resources = "/homeGambling.csv", numLinesToSkip = 1)
   // public void test

}
