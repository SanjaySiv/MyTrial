package com.example.helloworld;

public class ThreadJoin extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        ThreadJoin t1=new ThreadJoin();
        ThreadJoin t2=new ThreadJoin();
        ThreadJoin t3=new ThreadJoin();
        ThreadJoin t4=new ThreadJoin();
        t1.start();
        try{
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("t2 starts after completing t1");
        t2.start();
        try {
            t2.join(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("t3 and t4 starts after t2 running for 1500millis");
        t3.start();
        t4.start();
    }
}
