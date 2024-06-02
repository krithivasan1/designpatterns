package com.example.designpatterns.ProtoTypeDesignPattern;

public class IntelligentStudent extends Student{
    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    int iq ; // This iq is specific to the Intelligent student object

    public IntelligentStudent( ) {

    }

    public IntelligentStudent(IntelligentStudent copy) {
        super(copy);
        this.iq = copy.iq;
    }

    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
