package com.example.helloworld;

public class IterableExample {
    public static void main(String[] args){
        UrlLibrary urlLibrary=new UrlLibrary();
<<<<<<< HEAD
        for(String url:urlLibrary){
            System.out.println(url);
=======
        for(String html:urlLibrary){
            System.out.println(html.length());
>>>>>>> 53d8977 (Iterable example with url)
        }
    }
}
