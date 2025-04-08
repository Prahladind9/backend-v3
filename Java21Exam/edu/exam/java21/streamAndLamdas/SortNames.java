package edu.exam.java21.streamAndLamdas;

import java.util.ArrayList;
import java.util.List;

public class SortNames {

    public static void main(String[] args) {
        var names = new ArrayList<>(List.of("fibona", "swap", "german"));

        names.sort((s1, s2) -> {
            return s1.length() - s2.length();
        });

        //same as above
        names.sort((final String s1, String s2) -> {
            return s1.length() - s2.length();
        });

        //same as below
        names.sort((s1, s2) -> s1.length() - s2.length());

        System.out.println(names);

        var greeting = "Hello, ";  //Effectively final
        names.forEach(name -> System.out.println(greeting + name));
        //greeting = ""; //cannot do this

        int count = 0;
        //names.forEach(name -> count++); // cannot do this as well
    }
}
