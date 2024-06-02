package com.example.designpatterns.StrategyPattern;

public class CarPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Car path is returned");
    }
}
