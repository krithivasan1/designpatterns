package com.example.designpatterns.builderDesignPattern;

public class Student {
    String name;
    int age;
    String batch;
    String universityName;
    double psp;
    int gradYear;
    String phoneNumber;

    Student(Builder builder) {
        // all the validation in the Constructor
        if (builder.gradYear <= 2015) {
            throw new RuntimeException("Grad Year is less than 2015");
        }
        this.name = builder.name;
        this.age = builder.age;
        this.batch = builder.batch;
        this.universityName = builder.universityName;
        this.psp = builder.psp;
        this.gradYear = builder.gradYear;
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder getBuilder() {
        return new Builder();
    }


    public static class Builder {
        String name ;
        int age;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        String batch;
        String universityName;
        double psp;
        int gradYear;
        String phoneNumber;

        public Student build(){
            return new Student(this);
        }
    }

}
