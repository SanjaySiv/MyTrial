package com.example.helloworld;

import java.util.Vector;

public class CollectionVector {
    public static void main(String[] args){
        Vector<String>v=new Vector<>();
        v.add("vijay");
        v.add("Ajit");
        v.add("Surya");
        v.add("Vikram");
        v.remove(1);
        for(String name:v){
            System.out.println(name);
        }
    }
}
