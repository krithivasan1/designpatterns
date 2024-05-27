package com.example.designpatterns.FactoryDesignPattern;

public class WindowsUIFactory implements UIFactory{
    public Button createButton() {
       return new WindowsButton();
    }
}
