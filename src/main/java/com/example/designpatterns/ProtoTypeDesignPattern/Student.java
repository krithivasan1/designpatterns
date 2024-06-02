package com.example.designpatterns.ProtoTypeDesignPattern;

public class Student implements Prototype<Student> {
    String name;
    String batchName;
    double psp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getAvgpsp() {
        return avgpsp;
    }

    public void setAvgpsp(double avgpsp) {
        this.avgpsp = avgpsp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    double avgpsp;
    int age;
    String city;

    public Student(){

    }

    public Student(Student copy){
        this.name = copy.name;
        this.batchName = copy.batchName;
        this.psp = copy.psp;
        this.age = copy.age;
        this.avgpsp = copy.avgpsp;
        this.city = copy.city;
    }

    @Override
    public Student clone() {
        return new Student(this);

    }
}
