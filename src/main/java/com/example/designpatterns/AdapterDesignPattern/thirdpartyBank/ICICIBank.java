package com.example.designpatterns.AdapterDesignPattern.thirdpartyBank;

public class ICICIBank {
    public void sendMoney(String source,String destination, double amount){
        System.out.println("From ICICI " + source+" transfers monety to "+destination + " on the amount "+amount);
    }
}


