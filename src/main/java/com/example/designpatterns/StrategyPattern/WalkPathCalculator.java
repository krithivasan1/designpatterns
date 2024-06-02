package com.example.designpatterns.StrategyPattern;

public class WalkPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Walk path is returned");
    }
}
