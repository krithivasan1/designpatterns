package com.example.designpatterns.Singleton;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection dbc = DatabaseConnection.getInstance();

        DatabaseConnection dbc1 = DatabaseConnection.getInstance();
        System.out.println("Debug");
        // You can see the dbc and dbc1 creates the same object
    }
}
