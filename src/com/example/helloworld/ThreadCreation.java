package com.example.helloworld;

class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread1 running");
    }
}
class Thread2 implements Runnable{
    public void run(){
        System.out.println("Thread2 running");
    }
}
public class ThreadCreation {
    public static void main(String [] args){
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        //t2.start(); not possible t2 is not an object of thread class
        Thread t=new Thread(t2);
        t.start();
    }
}
