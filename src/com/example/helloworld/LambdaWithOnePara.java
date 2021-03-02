package com.example.helloworld;

interface SayOne{
    String say(String name);
}
public class LambdaWithOnePara {
    public static void main(String[] args){
        SayOne one=(name)-> "Hello "+name ;
        System.out.println(one.say("Vijay"));
    }
}
