package com.example.helloworld;

public class MethodReferenceRunnable {
    public static void ThreadStatus(){
        System.out.println("Thread running...");
    }
    public static void main(String[] args){
        Thread t=new Thread(MethodReferenceRunnable::ThreadStatus);
        t.start();
    }
}
