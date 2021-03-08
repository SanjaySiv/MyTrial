package com.example.helloworld;

import java.io.IOException;

class M{
    void method() throws IOException{
        throw new IOException("Device error");
    }
}
public class ExceptionUsingTryCatch {
    public static void main(String [] args){
        try{
            M m=new M();
            m.method();
        }catch (Exception e){
            System.out.println("Handled");
        }
        System.out.println("Rest of the  code");
    }
}
