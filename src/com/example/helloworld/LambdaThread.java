package com.example.helloworld;

public class LambdaThread {
    public static void main(String[] args){
        //thread creation without lambda
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 running");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
        //thread creation with lambda
        Runnable r2=()-> System.out.println("Thread2 running");
        Thread t2=new Thread(r2);
        t2.start();
    }
}
