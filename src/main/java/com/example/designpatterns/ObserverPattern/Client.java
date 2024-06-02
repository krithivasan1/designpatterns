package com.example.designpatterns.ObserverPattern;

public class Client {
    public static void main(String[] args) {
        AmazonPublisher amazonPublisher = AmazonPublisher.getInstance();
        EmailService emailService =new EmailService(amazonPublisher);
        InventoryService inventoryService=new InventoryService(amazonPublisher);
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(amazonPublisher);
        amazonPublisher.orderPlace();

    }
}
