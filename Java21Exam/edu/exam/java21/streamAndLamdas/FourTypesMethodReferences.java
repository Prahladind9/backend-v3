package edu.exam.java21.streamAndLamdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class FourTypesMethodReferences {
    public static void main(String[] args) {
        var names = new ArrayList<>(List.of("Susann", "Alex", "Rob", "Dave"));

        //Method reference to a static method
        names.sort(FourTypesMethodReferences::compareByLength);

        //Method reference to an instance method for a specific object
        names.forEach(System.out::println);

        //Method reference to an instance method
        Function<String, String> transformer = String::toUpperCase;
        System.out.println(transformer.apply(names.get(0)));

        //Method reference to a constructor
        Supplier<List<String>> listFactory = ArrayList::new;
        var list =  listFactory.get();
    }

    static int compareByLength(String s1, String s2){
        return s1.length() - s2.length();
    }
}
