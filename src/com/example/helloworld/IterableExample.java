package com.example.helloworld;

public class IterableExample {
    public static void main(String[] args){
        UrlLibrary urlLibrary=new UrlLibrary();
        for(String url:urlLibrary){
            System.out.println(url);
        }
    }
}
