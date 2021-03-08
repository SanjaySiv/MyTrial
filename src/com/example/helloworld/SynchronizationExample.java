package com.example.helloworld;

class MultiTable{
    /*synchronized void multiplication(int n){  //synchronized method
        for(int i=1;i<6;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }*/
    void multiplication(int n) {
        synchronized (this) {   //synchronized block
            for (int i = 1; i < 6; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class Thread6 extends Thread{
    MultiTable t;
    public Thread6(MultiTable t){
        this.t=t;
    }
    public void run(){
        t.multiplication(5);
    }
}
class Thread7 extends Thread{
    MultiTable t;
    public Thread7(MultiTable t){
        this.t=t;
    }
    public void run(){
        t.multiplication(100);
    }
}
public class SynchronizationExample {
    public static void main(String[] args){
        MultiTable t=new MultiTable();
        Thread6 t6=new Thread6(t);
        Thread7 t7=new Thread7(t);
        t6.start();
        t7.start();
    }
}
