package com.example.designpatterns.ObserverPattern;


public class EmailService implements AmazonOrderPlacedSubscriber {

    public EmailService(AmazonPublisher amazonPublisher){
        amazonPublisher.register(this);
    }
    @Override
    public void orderPlace() {
        System.out.println("EmailService  is called");
    }
}