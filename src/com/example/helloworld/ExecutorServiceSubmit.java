package com.example.helloworld;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceSubmit {
    public static void main(String [] args){
        ExecutorService ex= Executors.newSingleThreadExecutor();
        ex.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executor service");
            }
        });
        ex.shutdown();
    }
}
