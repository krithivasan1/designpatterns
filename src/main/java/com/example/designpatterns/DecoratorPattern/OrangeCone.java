package com.example.designpatterns.DecoratorPattern;
// This is the base cone
public class OrangeCone implements IceCream{

    public OrangeCone(){

    }
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "This is the base :OrangeCone";
    }
}
