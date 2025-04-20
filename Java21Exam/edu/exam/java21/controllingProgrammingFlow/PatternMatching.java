package edu.exam.java21.controllingProgrammingFlow;

public class PatternMatching {

    public static void main(String[] args) {
        describeNumber(9);
    }
    static void describeNumber(Number input){
        String message = switch (input) {
            case Integer i -> "whole: " + i;
            case Double d -> "exact: " + d;
            case Number n -> "unknown: " + n;
            //here we didn't use default bcz all scenarios are covered
        };

        System.out.println(message);

        String range = switch (input) {
            case Integer i when i < 10 -> "range: < 10 " + i;
            case Integer i             -> "range: >= 10" + i;
            case null, default -> "unexpected";
        };

        System.out.println(range);

    }
}
