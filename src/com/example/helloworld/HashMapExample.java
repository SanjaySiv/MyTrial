package com.example.helloworld;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args){
        HashMap<Integer,String>fruit=new HashMap<>();
        fruit.put(1,"Mango");
        fruit.put(3,"Apple");
        fruit.put(2,"Banana");
        fruit.put(4,"Orange");
        System.out.println("iterating");
        for(Map.Entry<Integer,String> f:fruit.entrySet()){
            System.out.println(f.getKey()+" "+f.getValue());
        }
        fruit.remove(2);
        System.out.println(fruit);
    }
}
