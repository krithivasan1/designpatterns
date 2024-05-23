package com.example.designpatterns.builderDesignPattern;

public class Client {
    public static void main(String args[]) {
        Builder builder = new Builder();
        builder.setName("Krithi");
        builder.setAge(23);
        builder.setBatch("April2023 Morning batch");
        builder.setGradYear(2022);
        builder.setPhoneNumber("12344234");
        builder.setUniversityName("Java University");
        //Student student = new Student(builder);
        Student student = Student.getBuilder().setName("Krithi").
                setAge(23).
                setBatch("April2023 Morning batch").
                setGradYear(2022).
                setPhoneNumber("123123").
                setUniversityName("Java university").
                build();

    }
}
