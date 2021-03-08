package com.example.helloworld;

public class ThreadStartTwice extends Thread{
    public void run(){
        System.out.println("Thread running....");
    }
    public static void main(String[] args){
        ThreadStartTwice t=new ThreadStartTwice();
        t.start();
        t.start();
    }
}
