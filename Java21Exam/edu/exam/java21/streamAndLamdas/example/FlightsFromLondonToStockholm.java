package edu.exam.java21.streamAndLamdas.example;

import java.util.ArrayList;
import java.util.Comparator;

public class FlightsFromLondonToStockholm {
    public static void main(String[] args) {

        var flights = new ArrayList<Flight>();

        flights.stream()
                .filter(flight -> flight.isFromTo("London", "Stockholm"))
                .flatMap(flight -> flight.fares().stream())
                .sorted((fare1, fare2) -> fare1.price().compareTo(fare2.price())) //may need more memory
                .forEach(System.out::println);

        flights.stream()
                .filter(flight -> flight.isFromTo("London", "Stockholm"))
                .flatMap(flight -> flight.fares().stream())
                .sorted(Comparator.comparing(Fare::price)) //may need more memory
                .forEach(System.out::println);
    }
}
