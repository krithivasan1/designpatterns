package com.example.designpatterns.FactoryDesignPattern.Assignment_Notification_Solved;


public class NotificationFactory {
    public static Notification getNotification(NotificationType notificationType, String sender, String receiver, String message) {
        if (notificationType == NotificationType.EMAIL) {
            return new EmailNotification(   receiver,sender,message);
        } else if (notificationType == NotificationType.SMS) {
            return new SmsNotification(receiver, message);
        } else if (notificationType == NotificationType.PUSH) {
            return new PushNotification(receiver, message);
        }
        return null;
    }
}