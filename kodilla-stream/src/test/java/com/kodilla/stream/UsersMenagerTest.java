package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsersMenagerTest {

    @Test
        public void testFilterChemistGroupUsernames() {
            //given
            UsersMenager chemists = new UsersMenager();
            //when
            List<String> result = chemists.filterChemistGroupUsernames();
            //then
            List<String> expected = new ArrayList<>();
            expected.add("Walter White");
            expected.add("Gale Boetticher");
            assertEquals(expected, result);
            System.out.println("chemist");
            System.out.println(result);
            System.out.println(expected);
        }
    public void testFilterAgeTo() {
        //given
        UsersMenager chemists = new UsersMenager();
        //when
        List<String> result = chemists.filterChemistGroupUsernames();
        //then
        List<String> expected = new ArrayList<>();
        expected.add("Walter White");
        expected.add("Gale Boetticher");
        assertEquals(expected, result);
        System.out.println("chemist");
        System.out.println(result);
        System.out.println(expected);
    }

    }
