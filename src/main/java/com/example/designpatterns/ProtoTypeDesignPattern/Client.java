package com.example.designpatterns.ProtoTypeDesignPattern;

import java.sql.SQLOutput;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry){
        Student prototype1 = new Student();
        prototype1.setAvgpsp(90.0);
        prototype1.setBatchName("Batch1_apr2023Beginner");
        studentRegistry.register("Batch1_apr2023Beginner",prototype1);

        IntelligentStudent prototype2 = new IntelligentStudent();
       prototype2.setAvgpsp(95.0);
        prototype2.setBatchName("Batch1_apr2023Intelligent");
        prototype2.setIq(160);
        studentRegistry.register("Batch1_apr2023Intelligent",prototype2);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student st1 = studentRegistry.get("Batch1_apr2023Beginner").clone();
        st1.setName("Krithi");
        st1.setAge(23);
        st1.setCity("Chennai");
        st1.setPsp(70.0);

        Student st3 = studentRegistry.get("Batch1_apr2023Beginner").clone();
        st3.setName("Deepak");
        st3.setAge(24);
        st3.setCity("Bangalore");
        st3.setPsp(90.0);

        Student st2 = studentRegistry.get("Batch1_apr2023Intelligent").clone();
        st2.setName("Vasan");
        st2.setAge(24);
        st2.setCity("Trichy");
       // st2.setPsp(71.0);

        System.out.println("DEBUG point");

    }
}
