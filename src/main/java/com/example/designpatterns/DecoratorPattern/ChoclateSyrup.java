package com.example.designpatterns.DecoratorPattern;

public class ChoclateSyrup implements IceCream{
    IceCream iceCream;

    public ChoclateSyrup(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost()+10;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+ " + Choclate Syrup";
    }
}
