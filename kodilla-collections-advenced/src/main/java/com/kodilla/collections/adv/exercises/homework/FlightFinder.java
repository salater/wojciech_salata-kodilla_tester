package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {


    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightsTable = FlightRepository.getFlightsTable();
        List<Flight> flightsFound = new ArrayList<>();
        for (Flight result : flightsTable)
            if (departure == result.getDeparture()) {
                flightsFound.add(result);
            }
        return flightsFound;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightsTable = FlightRepository.getFlightsTable();
        List<Flight> flightsFound = new ArrayList<>();
        for (Flight result : flightsTable)
            if (arrival == result.getArrival()) {
                flightsFound.add(result);
            }
        return flightsFound;

    }


}
