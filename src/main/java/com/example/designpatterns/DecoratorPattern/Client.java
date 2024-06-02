package com.example.designpatterns.DecoratorPattern;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Client {
    public static void main(String[] args) {
        IceCream ic = new ChoclateChips(new StrawberryScoop(new VannilaScoop(new ChoclateCone(new ChoclateSyrup(new OrangeCone())))));
        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());
    }
}
