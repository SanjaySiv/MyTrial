package com.example.helloworld;

public class EqualityComparison {
    public static void main(String[] args){
        System.out.println(10==20);
        System.out.println('a'=='A');
        System.out.println('a'==97);
        String s1=new String("String");
        String s2=new String("String");
        String s3="hello";
        String s4="hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
