package com.example.designpatterns.ProtoTypeDesignPattern.Assignment_ConfigurationProtoType_Solved;

import java.util.HashMap;

class ConfigurablePrototypeRegistryImpl implements ConfigurationPrototypeRegistry{

    public HashMap<ConfigurationType,Configuration> map = new HashMap<>();
    public void addPrototype(Configuration user){
        map.put(user.getType(),user);

    }

    public Configuration getPrototype(ConfigurationType type){
        return map.get(type);
    }

    public Configuration clone(ConfigurationType type){
        return map.get(type).cloneObject();

    }
}