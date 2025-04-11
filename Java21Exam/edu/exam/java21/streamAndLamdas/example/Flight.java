package edu.exam.java21.streamAndLamdas.example;

import java.time.ZonedDateTime;
import java.util.List;

public record Flight(int number, Airline airline, String origin, String destination,
                     ZonedDateTime departureTime, ZonedDateTime arrivalTime, long distance, List<Fare> fares)
{

    public boolean isFromTo(String origin, String destination){
        return origin.equals(this.origin) && destination.equals(this.destination);
    }

}
