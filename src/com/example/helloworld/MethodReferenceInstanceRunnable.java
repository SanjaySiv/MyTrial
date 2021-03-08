package com.example.helloworld;

public class MethodReferenceInstanceRunnable {
    public void printMessage(){
        System.out.println("thread  running");
    }
    public static void main(String [] args){
        Thread t=new Thread(new MethodReferenceInstanceRunnable()::printMessage);
        t.start();
    }
}
