package edu.exam.java21.streamAndLamdas.example;

import java.math.BigDecimal;

public record Fare(ComfortLevel comfortLevel, BigDecimal price, int availability) {
}

