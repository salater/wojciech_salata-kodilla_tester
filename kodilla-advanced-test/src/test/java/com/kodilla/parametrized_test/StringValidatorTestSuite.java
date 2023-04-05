package com.kodilla.parametrized_test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.testng.AssertJUnit.assertTrue;

public class StringValidatorTestSuite {
    private StringValidator validator = new StringValidator();
/*
    @Test
    public void shouldReturnFalseIfStringIsNotEmpty() {
        assertFalse(validator.isBlank("test"));
    }

    @Test
    public void shouldReturnTrueIfStringIsEmpty() {
        assertTrue(validator.isBlank(""));
    }

    @Test
    public void shouldReturnTrueIfStringHasOnlySpaces() {
        assertTrue(validator.isBlank("   "));
    }

 */  // stere dane osobno za kazdym razem

    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfStringIsNull(String text) {
        assertTrue(validator.isBlank(text));
    }
/*    @Test
    public void shouldReturnTrueIfStringIsNull() {
        assertTrue(validator.isBlank(null));
    }

 */   // null w wersji bez parametryzacji

    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text) { // puste dane wejsciowe
        assertTrue(validator.isBlank(text));
    }
@ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmptyAndNull(String text) {
    System.out.println("|" + text + "|"); // wyswietala jakie sa dane wejsciowe null czy spacje lub bez
    assertTrue(validator.isBlank(text));
}


}


