package com.kodilla.stream.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {

    private Map<String, Boolean> getListOfAirport () {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Miami", true );
        airports.put("Malta", true );
        airports.put("LasPAlmas", false );
        airports.put("Warsaw", true );
    return airports;
    }
    public boolean isAirportInUse(String airport) throws AirportNotFoundException {
        if (getListOfAirport().containsKey(airport))
            return getListOfAirport().get(airport);
        throw  new AirportNotFoundException();
    }
}
