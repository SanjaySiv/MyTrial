package com.example.helloworld;

interface Sayable{
    void say();
}
public class MethodReference1 {
    public static void saySomething(){
        System.out.println("Static method");
    }
    public static void main(String[] args){
        Sayable sayable=MethodReference1::saySomething;
        sayable.say();
    }
}
