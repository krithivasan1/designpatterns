package com.example.designpatterns.DecoratorPattern;

public class VannilaScoop implements IceCream{
    IceCream iceCream;

    public VannilaScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost()+12;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+ " + Vannilla scoop";
    }
}
