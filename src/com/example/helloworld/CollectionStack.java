package com.example.helloworld;

import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args){
        Stack<String>s=new Stack<>();
        s.push("Vijay");
        s.push("Ajith");
        s.push("Surya");
        s.push("Vikram");
        s.pop();    //LIFO
        for (String name:s){
            System.out.println(name);
        }
    }
}
