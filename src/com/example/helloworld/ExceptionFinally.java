package com.example.helloworld;

public class ExceptionFinally {
    public static void main(String[] args){
        try{
            int n=10/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally method");
        }
    }
}
