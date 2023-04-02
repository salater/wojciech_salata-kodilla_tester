package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Krakow", "NewYork"));
        flights.add(new Flight("Berlin", "Tokyo"));
        flights.add(new Flight("Kato", "Wroclaw"));
        flights.add(new Flight("Radom", "Rome"));

        return flights;
    }


}
