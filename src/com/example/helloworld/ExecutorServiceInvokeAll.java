package com.example.helloworld;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class ExecutorServiceInvokeAll {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService ex= Executors.newSingleThreadExecutor();
        Set<Callable<String>>callable=new HashSet<>();
        callable.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task1";
            }
        });
        callable.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task2";
            }
        });
        callable.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task3";
            }
        });
        List<Future<String>>futures=ex.invokeAll(callable);
        for(Future<String>future:futures){
            System.out.println("future.get="+future.get());
        }
        ex.shutdown();
    }
}
