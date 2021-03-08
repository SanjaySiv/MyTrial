package com.example.helloworld;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String [] args){
        TreeMap<Integer,String>treeMap=new TreeMap<>();
        treeMap.put(7, "Mango");
        treeMap.put(3, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(4, "Orange");
        treeMap.put(1,"Apple");
        for(Map.Entry<Integer,String>m1:treeMap.entrySet()){
            System.out.println(m1.getKey()+" "+m1.getValue());
        }
        System.out.println("NavigableMap");
        NavigableMap<Integer,String>navMap=new TreeMap<>();
        navMap.put(7, "Mango");
        navMap.put(3, "Apple");
        navMap.put(2, "Banana");
        navMap.put(4, "Orange");
        navMap.put(1,"Apple");
        System.out.println("headMap : "+navMap.headMap(4,true));
        System.out.println("DescendingMap : "+navMap.descendingMap());
        System.out.println("tailMap : "+navMap.tailMap(3,true));
        System.out.println("subMap : "+navMap.subMap(4,false,7,false));
        System.out.println("SortedMap");
        SortedMap<Integer,String> sortMap=new TreeMap<>();
        sortMap.put(7, "Mango");
        sortMap.put(3, "Apple");
        sortMap.put(2, "Banana");
        sortMap.put(4, "Orange");
        sortMap.put(1,"Apple");
        System.out.println("headMap : "+sortMap.headMap(4));
        System.out.println("tailMap : "+sortMap.tailMap(3));
        System.out.println("subMap : "+sortMap.subMap(4,7));
    }
}
