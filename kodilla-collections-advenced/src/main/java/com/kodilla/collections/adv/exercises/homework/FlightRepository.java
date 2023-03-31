package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {


    public List<Flight> getFlightsTable() {
        Flight flight = new Flight("Katowice", "Rome");
        Flight flight1 = new Flight("Wroclaw", "Madrid");
        List<Flight> flights = new ArrayList<>();
        flights.add(flight);
        flights.add(flight1);
        return flights;

    }

}
