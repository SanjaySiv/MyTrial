package com.example.helloworld;

import java.io.IOException;

public class ExceptionThrows {
    void m() throws IOException {
        throw new IOException("Devise error");
    }
    void n() throws IOException {
        o();
    }
    void o() throws IOException {
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("exception handled");
        }
    }
    public static void main(String[] args){
        ExceptionThrows et=new ExceptionThrows();
        et.p();
    }
}
