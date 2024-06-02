package com.example.designpatterns.FactoryDesignPattern.Assignment_Document_Solved;


public abstract class DocumentProcessor {
    public  String documentName;

    public abstract DocumentType supportsType();
    public abstract void processDocument();



}
