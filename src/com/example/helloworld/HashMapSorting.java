package com.example.helloworld;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapSorting {
    public static void  main(String [] args){
        HashMap<Integer, String> fruit = new HashMap<>();
        fruit.put(1, "Mango");
        fruit.put(3, "Apple");
        fruit.put(2, "Banana");
        fruit.put(4, "Orange");
        System.out.println("comparingByKey Ascending order");
        fruit.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("comparingByKey Descending order");
        fruit.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        System.out.println("comparingByValue Ascending order");
        fruit.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("comparingByValue Ascending order");
        fruit.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }
}
