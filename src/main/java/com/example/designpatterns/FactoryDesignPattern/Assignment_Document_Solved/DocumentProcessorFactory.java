package com.example.designpatterns.FactoryDesignPattern.Assignment_Document_Solved;


public class DocumentProcessorFactory {

    public static DocumentProcessor getDocumentProcessor(DocumentType documentType,String filename){
        if(documentType==DocumentType.TEXT)
        {
            return new TextDocumentProcessor(filename);
        }
        else if(documentType==DocumentType.PRESENTATION){
            return new PresentationDocumentProcessor(filename);
        }else if(documentType==DocumentType.SPREAD_SHEET){
            return new SpreadsheetDocumentProcessor(filename);
        }
        else
            return null;

    }
}