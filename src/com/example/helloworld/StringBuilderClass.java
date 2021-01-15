package com.example.helloworld;

public class StringBuilderClass {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder();
        sb.append("hello");
        System.out.println(sb);
        sb.insert(0,"java");
        System.out.println(sb);
        sb.replace(0,3,"Hi");
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
