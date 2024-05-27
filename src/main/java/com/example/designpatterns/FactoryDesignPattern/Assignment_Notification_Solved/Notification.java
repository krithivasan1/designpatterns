package com.example.designpatterns.FactoryDesignPattern.Assignment_Notification_Solved;


public abstract class Notification {
    public String recipient;
    public String message;

    public Notification(){}

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public abstract NotificationType notificationType();
    public abstract void sendNotification();

}
