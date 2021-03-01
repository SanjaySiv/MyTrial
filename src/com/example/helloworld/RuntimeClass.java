package com.example.helloworld;

import java.io.IOException;

public class RuntimeClass {
    public static void main(String[] args) throws IOException {
        Runtime r=Runtime.getRuntime();
        //r.exec("notepad");
        System.out.println("Total memory : "+r.maxMemory());
        System.out.println("Free memory : "+r.freeMemory());
        for(int i=0;i<10000;i++){
            new RuntimeClass();
        }
        System.out.println("Free space after creating 10000 instances : "+r.freeMemory());
        System.gc();
        System.out.println("Free space after gc() : "+r.freeMemory());
    }
}
