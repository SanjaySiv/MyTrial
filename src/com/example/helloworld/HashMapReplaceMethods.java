package com.example.helloworld;

import java.util.HashMap;

public class HashMapReplaceMethods {
    public static void main(String[] args) {
        HashMap<Integer, String> fruit = new HashMap<>();
        fruit.put(1, "Mango");
        fruit.put(3, "Apple");
        fruit.put(2, "Banana");
        fruit.put(4, "Orange");
        System.out.println(fruit);
        fruit.replace(3,"Water Melon");
        System.out.println("After 1st replacement");
        System.out.println(fruit);
        fruit.replace(2,"Banana","Guava");
        System.out.println("After 2nd replacement");
        System.out.println(fruit);
        System.out.println("Replace all");
        fruit.replaceAll((k,v)->"Empty");
        System.out.println(fruit);
    }
}
