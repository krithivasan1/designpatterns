package com.example.designpatterns.FactoryDesignPattern;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryForPlatform(Platform platform) {
        if (platform.equals(Platform.WINDOWS)) {
            return new WindowsUIFactory();
        } else if (platform.equals(Platform.IOS)) {
            return new IOSUIFactory();
        } else if (platform.equals(Platform.ANDROID)) {
            return new AndroidUIFactory();
        } else return null;
    }
}
