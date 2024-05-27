package com.example.designpatterns.FactoryDesignPattern;

public class WindowsButton implements Button{
    public void showButton() {
        System.out.println("Windows button Showing");
    }

    @Override
    public void clickButton() {
        System.out.println("Windows button clicked ");

    }
}
