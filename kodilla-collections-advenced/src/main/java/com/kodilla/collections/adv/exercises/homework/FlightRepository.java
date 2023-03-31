package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FlightRepository {

    //moj lot ma zawierac skad wylatuje i gdzie laduje
    // np: Katowice do Rome


    public Collection<Flight> getFlightsTable(Flight flight) {

        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Katowice", "Rome"));
        flightList.add(new Flight("Wroclaw", "Madrid"));
        return flightList;
    }

}
