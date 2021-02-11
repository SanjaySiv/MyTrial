package com.example.helloworld;

public class ExceptionExample1 {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 30 / 0;
        } catch (Exception e) {
            System.out.println("Exception");
        }/*catch (ArithmeticException e){
            System.out.println("arithmeticException");
        }*/ //Exception order should be maintained
    }
}
