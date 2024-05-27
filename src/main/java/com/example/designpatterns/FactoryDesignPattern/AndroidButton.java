package com.example.designpatterns.FactoryDesignPattern;

import ch.qos.logback.core.net.SyslogOutputStream;

public class AndroidButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Android button Showing");
    }

    @Override
    public void clickButton() {
        System.out.println("Android button clicked ");

    }
}
