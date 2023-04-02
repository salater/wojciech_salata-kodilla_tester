package com.kodilla.collections.adv.exercises.homework;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class FlightFinderTest {


    @Test
    public void testFindFlightsFrom() {
//given
        FlightFinder flightFinderFrom = new FlightFinder();
        //when
        List<Flight> result = flightFinderFrom.findFlightsFrom("Kato");
        //then
        Flight flightsfromKato = new Flight("Kato", "Wroclaw");
        List<Flight> flightExpected = new ArrayList<>();
        flightExpected.add(flightsfromKato);
        assertEquals(flightExpected, result);

    }
    @Test
    public void testFindFlightsTo() {
//given
        FlightFinder flightFinderTo = new FlightFinder();
        //when
        List<Flight> result = flightFinderTo.findFlightsTo("Tokyo");
        //then
        Flight flightsToTokyo = new Flight("Berlin", "Tokyo");
        List<Flight> flightExpected = new ArrayList<>();
        flightExpected.add(flightsToTokyo);
        assertEquals(flightExpected, result);

    }
}
