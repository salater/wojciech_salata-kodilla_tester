package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTest {

    @Test
    void findFlightsFrom() {
        //given
        FlightFinder flightFinder = new FlightFinder();

        //when
        List<Flight> result = flightFinder.findFlightsFrom("Berlin");
        //then
        Flight flightFromKrakow = new Flight("Berlin", "Tokyo");
        List<Flight> flightsExpected = new ArrayList<>();
        flightsExpected.add(flightFromKrakow);
        assertEquals(flightsExpected, result);
    }

    @Test
    void findFlightsTo() {
        //given
        FlightFinder flightFinder = new FlightFinder();

        //when
        List<Flight> result = flightFinder.findFlightsTo("Wroclaw");
        //then
        Flight flightToWroclaw = new Flight("Kato", "Wroclaw");
        List<Flight> flightsExpected = new ArrayList<>();
        flightsExpected.add(flightToWroclaw);
        assertEquals(flightsExpected, result);
    }
}