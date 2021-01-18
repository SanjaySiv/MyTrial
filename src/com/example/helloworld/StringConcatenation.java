package com.example.helloworld;

public class StringConcatenation {
    public static void main(String[]args){
        String str="Hello";
        str+=" Good";
        str+=" Morning";
        System.out.println(str);

        StringBuffer sb=new StringBuffer("Hello");
        sb.append(" Good");
        sb.append(" Morning");
        System.out.println(sb);
    }
}
