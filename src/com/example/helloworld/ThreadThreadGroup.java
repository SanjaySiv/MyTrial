package com.example.helloworld;

public class ThreadThreadGroup implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args){
        ThreadThreadGroup group=new ThreadThreadGroup();
        ThreadGroup tg=new ThreadGroup("Parent Thread");
        Thread t1=new Thread(tg,group,"One");
        t1.start();
        Thread t2=new Thread(tg,group,"Two");
        t2.start();
        Thread t3=new Thread(tg,group,"Three");
        t3.start();
        System.out.println("Active count : "+tg.activeCount());
        System.out.println("ThreadGroup name : "+tg.getName());
        tg.list();
    }
}
