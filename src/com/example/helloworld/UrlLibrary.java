package com.example.helloworld;

import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String>{
    private LinkedList<String>urls=new LinkedList<>();
    UrlLibrary(){
        urls.add("www.google.com");
        urls.add("www.facebook.com");
        urls.add("www.twitter.com");
        urls.add("www.oracle.com");
    }
    @Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }
}
