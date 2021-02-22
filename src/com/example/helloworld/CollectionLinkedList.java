package com.example.helloworld;

import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String [] args){
        LinkedList<String>list=new LinkedList<>();
        list.add("Vijay");
        list.add("Ajay");
        list.add("Vijay");
        list.add("Ravi");
        list.remove(2);
        for(String name:list){
            System.out.println(name);
        }
    }
}