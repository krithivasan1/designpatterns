package com.example.designpatterns.FactoryDesignPattern;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.nio.file.StandardOpenOption;

public class Flutter {

    private String platform;

    public void refresh() {
        System.out.println("Refresh UI");
    }


    public void setTheme() {
        System.out.println("Set Theme UI");
    }

public UIFactory getUIFactory(Platform platform){
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
}
}
