package com.example.designpatterns.StrategyPattern;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculator(String mode) {
        PathCalculatorStrategy pathCalculator;
        if (mode == "Walk") {
            return new WalkPathCalculator();
        } else if (mode == "Car") {
            return new CarPathCalculator();
        } else return new BikePathCalculator();
    }
}
