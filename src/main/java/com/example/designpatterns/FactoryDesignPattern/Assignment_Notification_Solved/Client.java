package com.example.designpatterns.FactoryDesignPattern.Assignment_Notification_Solved;

public class Client {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.getNotification(NotificationType.SMS,"Sender","Receiver","Hi");
        notification.sendNotification();
    }
}
