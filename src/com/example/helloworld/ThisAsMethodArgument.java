package com.example.helloworld;

public class ThisAsMethodArgument {
    void display(ThisAsMethodArgument obj){
        System.out.println("Method invoked");
    }
    void call(){
        display(this);
    }
    public static void main(String [] args){
        ThisAsMethodArgument t=new ThisAsMethodArgument();
        t.call();
    }
}
