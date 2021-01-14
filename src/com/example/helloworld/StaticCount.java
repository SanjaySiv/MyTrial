package com.example.helloworld;

public class StaticCount {
    static int count=0;
    StaticCount(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args){
        StaticCount s1=new StaticCount();
        StaticCount s2=new StaticCount();
        StaticCount s3=new StaticCount();
    }
}
