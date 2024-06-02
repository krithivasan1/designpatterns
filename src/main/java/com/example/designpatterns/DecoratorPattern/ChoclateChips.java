package com.example.designpatterns.DecoratorPattern;

public class ChoclateChips implements IceCream{
    IceCream iceCream;

    public ChoclateChips(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost()+14;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+ " + Choclate Chips";
    }
}
