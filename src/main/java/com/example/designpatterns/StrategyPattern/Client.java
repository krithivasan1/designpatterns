package com.example.designpatterns.StrategyPattern;

public class Client {
    public static void main(String args[]){
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Trichy","Chennai","Bike");
    }
}
