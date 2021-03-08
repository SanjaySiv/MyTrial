package com.example.helloworld;


public class ExceptionPropagation {
    void m(){
        //throw new IOException("Device error");    //checked exceptions are not propagated
        int data=50/0;
        throw new ArithmeticException("Divided by zero");
    }
    void n(){
        m();
    }
    void p(){
        try {
            n();
        }catch(Exception e){
            System.out.println("Exception handled");
        }
    }
    public static void main(String [] args){
        ExceptionPropagation ep=new ExceptionPropagation();
        ep.p();
    }
}
