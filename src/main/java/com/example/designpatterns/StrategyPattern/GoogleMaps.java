package com.example.designpatterns.StrategyPattern;

public class GoogleMaps {
    public void findPath(String source,String destination,String mode){
        PathCalculatorStrategy pathCalculator = PathCalculatorFactory.getPathCalculator(mode);
        pathCalculator.findPath(source,destination);
    }
}
