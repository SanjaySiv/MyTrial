package com.example.helloworld;

class Thread3 extends Thread{
    public void run(){
        for (int i=0;i<5;i++) {
            System.out.println(i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadSleep {
    public static void main(String [] args){
        Thread3 t3=new Thread3();
        Thread3 t=new Thread3();
        t3.start();
        t.start();
    }
}
