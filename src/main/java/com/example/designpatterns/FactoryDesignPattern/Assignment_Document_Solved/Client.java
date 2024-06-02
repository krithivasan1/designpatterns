package com.example.designpatterns.FactoryDesignPattern.Assignment_Document_Solved;

import javax.swing.text.Document;

public class Client {
    public static void main(String[] args) {
        DocumentProcessor documentProcessor = DocumentProcessorFactory.getDocumentProcessor(DocumentType.TEXT,"TextFilename");
        documentProcessor.processDocument();
    }
}
