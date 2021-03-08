package com.example.helloworld;

class Temp implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closing");
    }
}
public class TryWithResource {
    public static void main(String [] args){
        try(Temp t=new Temp()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
