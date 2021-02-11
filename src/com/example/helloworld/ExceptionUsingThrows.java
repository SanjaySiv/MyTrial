package com.example.helloworld;

import java.io.IOException;

class N{
    void method() throws IOException{
        //System.out.println("Device operation performed");
        throw new IOException("Device error");
    }
}
public class ExceptionUsingThrows {
    public static void main(String[] args ) throws IOException {
        N n=new N();
        n.method();
        System.out.println("rest of the code");
    }
}
