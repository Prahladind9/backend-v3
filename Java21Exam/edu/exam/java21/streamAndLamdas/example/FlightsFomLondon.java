package edu.exam.java21.streamAndLamdas.example;

import java.util.ArrayList;
import java.util.List;

public class FlightsFomLondon {
    public static void main(String[] args) {
        var flights = new ArrayList<Flight>();

        flights.stream()
                .filter(flight -> flight.origin().equals("London"))
                .forEach(flight -> System.out.println(flight));

    }
}
