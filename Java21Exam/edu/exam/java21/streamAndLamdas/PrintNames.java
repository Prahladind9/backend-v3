package edu.exam.java21.streamAndLamdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Logger;

public class PrintNames {
    static Logger log = Logger.getLogger("StreamAndLamdas.PrintNames");
    public static void main(String[] args) {
        var names = List.of("Susan", "Ellie", "Michael");

        log.info("For Each: ");
        for (String name: names){
            log.info(name);
        }

        log.info("Traditional functional way using consumer: ");
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                log.info(s);
            }
        });


        log.info("Lambda way:");
        names.forEach(name -> log.info(name));

        log.info("Consumer type variable");
        Consumer<String> print = name -> log.info(name);
        names.forEach(print);

        //method references
        names.forEach(System.out::println);
    }
}
