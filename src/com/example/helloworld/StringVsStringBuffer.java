package com.example.helloworld;

public class StringVsStringBuffer {
    public static String concatWithString(){
        String t="java";
        for(int i=0;i<10000;i++){
            t+="tPoint";
        }
        return t;
    }
    public static String concatWithStringBuffer(){
        StringBuffer sb=new StringBuffer("java");
        for(int i=0;i<10000;i++){
            sb.append("tPoint");
        }
        return sb.toString();
    }

    public static void main(String[]args){
        long startTime=System.currentTimeMillis();
        concatWithString();
        System.out.println("Time taken by Concating with String : "+(System.currentTimeMillis()-startTime));
        startTime=System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time taken by Concating with StringBuffer : "+(System.currentTimeMillis()-startTime));
    }
}
