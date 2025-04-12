package edu.exam.java21.streamAndLamdas.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

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

        ConcurrentMap<String, List<Flight>> groupingByConcurrent = flights.stream().parallel()
                .filter(flight -> flight.isFromTo("London", "Stockholm"))
                .collect(Collectors.groupingByConcurrent(Flight::origin));

        Map<Boolean, List<Flight>> partitioningBy = flights.parallelStream()
                .collect(Collectors.partitioningBy(flight -> flight.distance() < 1000));
    }
}
