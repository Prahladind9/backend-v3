package edu.exam.java21.streamAndLamdas.example;

import java.util.ArrayList;

public class CollectingAndReducing {
    public static void main(String[] args) {
        var flights = new ArrayList<Flight>();


        flights.stream()
                .filter(flight -> flight.isFromTo("London", "Stockholm"));
    }
}
