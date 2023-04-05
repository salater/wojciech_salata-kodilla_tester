package com.kodilla.stream.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        //boolean isViennaInUse = false;
        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
            // isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status: " + isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry, the air port cannot be served by our airlines");
            //throw new RuntimeException(e);
        } finally {
            System.out.println("Thank you for using Kdilla Airlines");
        }
    }
}
