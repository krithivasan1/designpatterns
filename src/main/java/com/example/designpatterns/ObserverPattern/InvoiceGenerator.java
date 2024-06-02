package com.example.designpatterns.ObserverPattern;


public class InvoiceGenerator implements AmazonOrderPlacedSubscriber {

    public InvoiceGenerator(AmazonPublisher amazonPublisher){
        amazonPublisher.register(this);
    }
    @Override
    public void orderPlace() {
        System.out.println("Invoce generator is called");
    }
}