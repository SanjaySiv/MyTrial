package com.example.helloworld;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args){
        StringJoiner joinNames1=new StringJoiner(",");
        //setting empty value
        joinNames1.setEmptyValue("It is empty");
        System.out.println(joinNames1);
        //adding elements
        joinNames1.add("Vijay");
        joinNames1.add("Ajith");
        joinNames1.add("Surya");
        joinNames1.add("Vikram");
        //displaying string joiner after adding elements
        System.out.println(joinNames1);
        //StringJoiner with prefix and suffix
        StringJoiner joinNames2=new StringJoiner(",","[","]");
        joinNames2.add("Mohanlal");
        joinNames2.add("Mammootty");
        joinNames2.add("Tovino");
        joinNames2.add("Dileep");
        System.out.println(joinNames2);
        //length
        System.out.println("Length of joinNames2 : "+joinNames1.length());
        String str=joinNames1.toString();
        System.out.println(str);
        System.out.println("Character at index 7 "+str.charAt(7));
        StringJoiner merge=joinNames1.merge(joinNames2);
        System.out.println("Merged result : "+merge);
    }
}
