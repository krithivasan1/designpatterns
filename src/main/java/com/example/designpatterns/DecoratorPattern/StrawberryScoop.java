package com.example.designpatterns.DecoratorPattern;

public class StrawberryScoop implements IceCream{
    IceCream iceCream;

    public StrawberryScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost()+13;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+ " + Strawberry Scoop";
    }
}
