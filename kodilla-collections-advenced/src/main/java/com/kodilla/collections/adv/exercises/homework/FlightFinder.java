package com.kodilla.collections.adv.exercises.homework;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {

        Map<String, List<Flight>> find = new HashMap<>();

        public List<Flight> findFlightsFrom (String departure){
            return find.getOrDefault(departure, Collections.emptyList());
        }
        public List<Flight> findFlightsTo (String arrival){
            return find.getOrDefault(arrival, Collections.emptyList());
        }

}
