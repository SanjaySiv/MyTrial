package com.example.helloworld;

public class ThreadNameIdCurrent extends Thread{
    public void run(){
        System.out.println(currentThread().getName()+" running");
    }
    public static void main(String[] args){
        ThreadNameIdCurrent t1=new ThreadNameIdCurrent();
        ThreadNameIdCurrent t2=new ThreadNameIdCurrent();
        ThreadNameIdCurrent t3=new ThreadNameIdCurrent();
        System.out.println(t1.getName()+t1.getId());
        System.out.println(t2.getName()+t2.getId());
        t3.setName("Thread2 renamed ");
        System.out.println(t3.getName()+t3.getId());
        t1.start();
        t2.start();
        t3.start();
    }
}
