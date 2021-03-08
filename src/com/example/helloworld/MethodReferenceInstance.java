package com.example.helloworld;

public class MethodReferenceInstance {
    public void saySomething(){
        System.out.println("Non static method");
    }
    public static void main(String [] args){
        System.out.println("Referring non-static method using reference");
        MethodReferenceInstance m=new MethodReferenceInstance();
        Sayable sayable=m::saySomething;
        sayable.say();
        System.out.println("Referring no-static method using anonymous object");
        Sayable sayable1=new MethodReferenceInstance()::saySomething;
        sayable1.say();
    }
}
