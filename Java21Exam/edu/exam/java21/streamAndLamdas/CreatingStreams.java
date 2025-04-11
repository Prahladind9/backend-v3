package edu.exam.java21.streamAndLamdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {
        var names1 = List.of("Susan", "Ellie", "Michael");
        String[] names2 = {"Susan", "Ellie", "Michael"};

        Stream<String> stream1 = names1.stream();
        Stream<String> stream2 = Arrays.stream(names2);

        Stream<String> stream3 = Stream.of("Susan", "Ellie", "Michael");

        Stream<String> stream4 = Stream.ofNullable("Alex");// single element stream
        Stream<String> stream5 = Stream.ofNullable(null);// Empty stream

        Stream<String> stream6 = Stream.empty();
        Stream<String> stream7 =
                Stream.<String>builder()
                .add("Alex")
                .build();
    }
}
