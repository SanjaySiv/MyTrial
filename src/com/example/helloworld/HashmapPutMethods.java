package com.example.helloworld;

import java.util.HashMap;
import java.util.Map;

public class HashmapPutMethods {
    public static void main(String[] args){
        HashMap<Integer,String>fruit=new HashMap<>();
        fruit.put(1,"Mango");
        fruit.put(3,"Apple");
        fruit.put(2,"Banana");
        fruit.put(4,"Orange");
        for(Map.Entry<Integer,String> f:fruit.entrySet()){
            System.out.println(f.getKey()+" "+f.getValue());
        }
        fruit.putIfAbsent(5,"Grape");
        for(Map.Entry<Integer,String> f:fruit.entrySet()){
            System.out.println(f.getKey()+" "+f.getValue());
        }
        System.out.println("Copying using putAll()");
        HashMap<Integer, String> fruit1 = new HashMap<>();
        fruit1.putAll(fruit);  //copying values of one HashMap to another using putAll()
        for(Map.Entry<Integer,String> f:fruit1.entrySet()){
            System.out.println(f.getKey()+" "+f.getValue());
        }
        System.out.println("Copying using constructor");
        HashMap<Integer, String> fruit2 = new HashMap<>(fruit);//copying values of one HashMap to another using constructor
        for(Map.Entry<Integer,String> f:fruit2.entrySet()){
            System.out.println(f.getKey()+" "+f.getValue());
        }
    }
}
