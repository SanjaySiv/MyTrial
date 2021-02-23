package com.example.helloworld;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String [] args){
        LinkedHashMap<Integer,String>linked=new LinkedHashMap<>();
        linked.put(1, "Mango");
        linked.put(3, "Apple");
        linked.put(2, "Banana");
        linked.put(4, "Orange");
        System.out.println("Keys : "+linked.keySet());//fetching keys
        System.out.println("Values : "+linked.values());//fetching values
        System.out.println("Key-Value pair"+linked.entrySet());//fetching key-value pair
        System.out.println("Size of map: "+linked.size());
        System.out.println("Is the map empty : "+linked.isEmpty());
        System.out.println("Contains key 4 : "+linked.containsKey(4));
        System.out.println("Contains value Watermelon : "+linked.containsValue("Watermelon"));
        for(Map.Entry<Integer,String>lhm:linked.entrySet()){
            System.out.println(lhm);
        }
        linked.remove(2);
        System.out.println("After removing");
        linked.entrySet().forEach(System.out::println);
        for(Map.Entry<Integer,String>lhm2:linked.entrySet()){
            int key=lhm2.getKey();
            String value=lhm2.getValue();
            System.out.println(key+" "+value);
        }
    }
}
