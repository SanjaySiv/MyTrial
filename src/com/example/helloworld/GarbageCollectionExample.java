package com.example.helloworld;


public class GarbageCollectionExample {
    public void finalize(){
        System.out.println("Object is garbage collected");
    }
    public static void main(String[] args){
        GarbageCollectionExample g1=new GarbageCollectionExample();
        GarbageCollectionExample g2=new GarbageCollectionExample();
        g2=null;
        g1=null;
        System.gc();
    }
}
