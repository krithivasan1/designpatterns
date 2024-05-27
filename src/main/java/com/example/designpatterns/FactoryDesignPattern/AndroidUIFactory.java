package com.example.designpatterns.FactoryDesignPattern;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
