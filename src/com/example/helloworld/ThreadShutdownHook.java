package com.example.helloworld;

class Thread5 extends Thread{
    public void run(){
        System.out.println("Shutdown task completed");
    }
}
public class ThreadShutdownHook {
    public static void main(String[] args){
        Runtime r=Runtime.getRuntime();
        r.addShutdownHook(new Thread5());
        System.out.println("Now main sleeping press ctrl+c to exit");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
