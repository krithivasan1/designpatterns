package com.example.designpatterns.AdapterDesignPattern.thirdpartyBank;

public class YesBank {
    public void sendMoney(String source,String destination, double amount){
        System.out.println("From YES Bank "+source+" transfers monety to "+destination + " on the amount "+amount);
    }
}
