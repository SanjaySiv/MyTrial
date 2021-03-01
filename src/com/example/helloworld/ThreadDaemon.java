package com.example.helloworld;

public class ThreadDaemon extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread running");
        }
        else{
            System.out.println("user thread running");
        }
    }
    public static void main(String[] args){
        ThreadDaemon t1=new ThreadDaemon();
        ThreadDaemon t2=new ThreadDaemon();
        ThreadDaemon t3=new ThreadDaemon();
        //t1.start();//throws exception bcz of starting it before setting it as daemon
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
