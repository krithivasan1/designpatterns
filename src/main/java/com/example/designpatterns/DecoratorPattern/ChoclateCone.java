package com.example.designpatterns.DecoratorPattern;

public class ChoclateCone implements IceCream{
    IceCream iceCream;

    public ChoclateCone(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost()+10;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+ " + Choclate Cone";
    }
}
