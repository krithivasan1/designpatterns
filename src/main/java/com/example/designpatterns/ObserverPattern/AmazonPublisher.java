package com.example.designpatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class AmazonPublisher {
    public static AmazonPublisher instance = null;

    private AmazonPublisher() {
    }

    public List<AmazonOrderPlacedSubscriber> amazonOrderPlacedSubscribers = new ArrayList<AmazonOrderPlacedSubscriber>();

    public static AmazonPublisher getInstance() {
        if (instance == null) {
            synchronized (AmazonPublisher.class) {
                if (instance == null) {
                    instance = new AmazonPublisher();
                }
            }
        }
        return instance;
    }

    public void register(AmazonOrderPlacedSubscriber amazonOrderPlacedSubscriber) {
        amazonOrderPlacedSubscribers.add(amazonOrderPlacedSubscriber);
    }

    public void deregister(AmazonOrderPlacedSubscriber amazonOrderPlacedSubscriber) {
        amazonOrderPlacedSubscribers.remove(amazonOrderPlacedSubscriber);
    }

    public void orderPlace(){
        for(AmazonOrderPlacedSubscriber amazonOrderPlacedSubscriber:amazonOrderPlacedSubscribers){
            amazonOrderPlacedSubscriber.orderPlace();
        }
    }
}
