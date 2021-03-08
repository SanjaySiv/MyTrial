package com.example.helloworld;

public class SynchronizationDeadlock {
    public static void main(String[] args){
        final String resource1="resource 1";
        final String resource2="resource 2";
        Thread t1=new Thread(){
            public void run(){
                synchronized (resource1){
                    System.out.println("Thread1 locked resource1");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource2){   //not reached since t2 doesn't release resource2
                        System.out.println("Thread1 locked resource2");
                    }
                }
            }
        };
        Thread t2=new Thread(){
            public void run(){
                synchronized (resource2){
                    System.out.println("Thread2 locked resource2");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource1){   //not reached since t1 doesn't release resource1
                        System.out.println("Thread1 locked resource1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
