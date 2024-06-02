package com.example.designpatterns.ObserverPattern;

public class InventoryService implements AmazonOrderPlacedSubscriber {

    public InventoryService(AmazonPublisher amazonPublisher){
        amazonPublisher.register(this);
    }
    @Override
    public void orderPlace() {
System.out.println("Inventory service is called");
    }
}
