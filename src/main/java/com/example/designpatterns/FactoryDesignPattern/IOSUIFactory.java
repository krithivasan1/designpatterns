package com.example.designpatterns.FactoryDesignPattern;

public class IOSUIFactory  implements UIFactory{
    public Button createButton() {
        return new IOSButton();
    }
}
