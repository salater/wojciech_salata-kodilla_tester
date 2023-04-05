package com.kodilla.parametrized_test.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.Map;

import static org.testng.AssertJUnit.assertEquals;

public class UserValidatorTestSuit {

    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"mgrsalater", "234567Q", "...q..."})
    public void testValidateUsername(String username) {
        Map<String, Boolean> userNameValidation = new HashMap<>();
        userNameValidation.put("mgrsalater", true);
        userNameValidation.put("234567Q", true);
        userNameValidation.put("...q...", true);
        userNameValidation.put("q...Q", false);


        boolean result = validator.validateUsername(username);
        boolean expected = userNameValidation.get(username);
        assertEquals(expected, result);
    }

    @ParameterizedTest
//    @CsvSource({"mgrsalater@gmail.com", true,
//            "234567Q@onet.pl", true,
//            "Q....Q@o2.pl", true,
 //           "zenon23_9%gmail.com", false})
    public void testvalidateEmail(String email, boolean expected) {
        boolean result = validator.validateEmail(email);
        assertEquals(expected, result);
    }
}



