package com.example.helloworld;

class Customer{
    int amount=10000;
    synchronized void withdraw(int amount){
        System.out.println("Going to withdraw");
        if(this.amount<amount){
            System.out.println("Less balance, waiting for deposit");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.amount=amount;
        System.out.println("Cash withdraw completed");
    }
    synchronized void deposit(int amount){
        System.out.println("Going to deposit");
        this.amount+=amount;
        System.out.println("Deposit completed");
        notify();
    }
}
public class ThreadInterThreadComm {
    public static void main(String[] args){
        final Customer c=new Customer();
        Thread t1=new Thread(){
            public void run(){
                c.withdraw(12000);
            }
        };
        t1.start();
        Thread t2=new Thread(){
            public void run(){
                c.deposit(10000);
            }
        };
        t2.start();
    }
}
