package com.rbf7;

import java.util.HashMap;

public class AgeList {
    private HashMap<String, Integer> ages = new HashMap<>();

    public void add(String name, int age){
        ages.put(name, age);
    }
    public void remove(String name){
        ages.remove(name);
    }

    public int getAgeByName(String name){
        return ages.get(name);
    }
    public int getSize(){
        return ages.size();
    }
}
