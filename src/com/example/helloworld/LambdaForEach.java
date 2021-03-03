package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {
    public static void main(String[] args){
        List<String>list=new ArrayList<>();
        list.add("Vijay");
        list.add("Ajay");
        list.add("Surya");
        list.add("Balu");
        list.add("Tovino");
        list.forEach((n)->System.out.println(n)
        );
    }
}
