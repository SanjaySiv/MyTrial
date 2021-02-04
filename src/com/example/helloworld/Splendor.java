package com.example.helloworld;

import javax.net.ssl.SSLPeerUnverifiedException;

class Bike{
    public void run(){
        System.out.println("Bike is running");
    }
}
public class Splendor extends Bike {
    public void run(){
        System.out.println("Splendor is running");
    }
    public static void main(String[] args){
        Bike b=new Splendor();//upcasting
        b.run();//runtime polymorphism
    }
}
