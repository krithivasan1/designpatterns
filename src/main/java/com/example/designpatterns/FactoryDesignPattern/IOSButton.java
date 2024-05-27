package com.example.designpatterns.FactoryDesignPattern;

public class IOSButton implements Button{
    public void showButton() {
        System.out.println("IOS button Showing");
    }

    @Override
    public void clickButton() {
        System.out.println("IOS button clicked ");

    }
}
