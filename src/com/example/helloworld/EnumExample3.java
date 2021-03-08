package com.example.helloworld;

public enum EnumExample3 {
    WINTER,SUMMER,FALL,SPRING;
    public static void main(String[] args){
        for(EnumExample3 e:EnumExample3.values()){
            System.out.println(e);
        }
    }
}
