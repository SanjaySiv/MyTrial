package com.example.helloworld;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceInvokeAny {
    public static void main(String [] args) throws ExecutionException, InterruptedException {
        ExecutorService ex= Executors.newSingleThreadExecutor();
        Set<Callable<String >>callable=new HashSet<>();
        callable.add(new Callable<>() {
            @Override
            public String call() throws Exception {
                return "Task1";
            }
        });
        callable.add(new Callable<>() {
            @Override
            public String call() throws Exception {
                return "Task2";
            }
        });
        callable.add(new Callable<>() {
            @Override
            public String call() throws Exception {
                return "Task3";
            }
        });
        String result=ex.invokeAny(callable);
        System.out.println("Result = "+result);
        ex.shutdown();
    }
}
