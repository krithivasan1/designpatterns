package com.example.designpatterns.ProtoTypeDesignPattern.Assignment_ConfigurationProtoType_Solved;


public interface ConfigurationPrototypeRegistry {

    public void addPrototype(Configuration user);

    public Configuration getPrototype(ConfigurationType type);

    public Configuration clone(ConfigurationType type);
}