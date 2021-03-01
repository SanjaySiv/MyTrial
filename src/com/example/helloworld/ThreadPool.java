package com.example.helloworld;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Thread4 implements Runnable{
    private String message;
    Thread4(String message){
        this.message=message;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"(start) message= "+message);
        processMessage();
        System.out.println(Thread.currentThread().getName()+"(end)");
    }
    public void processMessage(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable obj = new Thread4("" +i);
            ex.execute(obj);
        }
        ex.shutdown();
        while(!ex.isTerminated()){}
        System.out.println("Finished all threads");
    }
}
