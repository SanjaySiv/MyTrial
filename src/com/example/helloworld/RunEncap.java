package com.example.helloworld;

public class RunEncap {
    public static void main(String[] args){
        EncapTest encap=new EncapTest();
        encap.setIdNum(7);
        encap.setName("John");
        encap.setAge(25);
        System.out.println(encap.getIdNum()+" "+encap.getName()+" "+encap.getAge());
    }
}
