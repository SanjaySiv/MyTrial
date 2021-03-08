package com.example.helloworld;

import java.util.HashMap;
import java.util.Map;

class Book{
    int id,quantity;
    String bookName,author,publisher;
    public Book(int id, String bookName, String author, String publisher, int quantity){
        this.id=id;
        this.bookName=bookName;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }
}

public class HashMapBook {
    public static void main(String[] args){
        HashMap<Integer,Book>book=new HashMap<>();
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        book.put(1,b1);
        book.put(2,b2);
        book.put(3,b3);
        System.out.println(book);
        for(Map.Entry<Integer,Book>b:book.entrySet()){
            int key=b.getKey();
            Book books=b.getValue();
            System.out.println(key+" Details");
            System.out.println(books.id+" "+books.bookName+" "+books.author+" "+books.publisher+" "+books.quantity);
        }
    }
}
