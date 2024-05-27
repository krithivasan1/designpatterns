package com.example.designpatterns.Singleton.assignment3;


public class DatabaseConnection {
    String name;
    boolean isAvailable;

    public DatabaseConnection(String name,boolean isAvailable){
        this.name =name;
        this.isAvailable=isAvailable;
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable=isAvailable;
    }

    public boolean isAvailable(){
        return this.isAvailable;
    }
}
