package edu.exam.java21.streamAndLamdas.example;

import java.util.ArrayList;
import java.util.List;

public class FlightsFomLondon {
    public static void main(String[] args) {
        var flights = new ArrayList<Flight>();

        flights.stream()
                .filter(flight -> flight.origin().equals("London"))
                .map(flight -> String.format("%s from London to %s", flight.airline().code(), flight.destination()))
                .forEach(System.out::println);

    }
}
