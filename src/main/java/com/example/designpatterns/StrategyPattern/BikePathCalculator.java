package com.example.designpatterns.StrategyPattern;

public class BikePathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Bike path is returned");
    }
}
