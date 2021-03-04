package com.example.helloworld;

interface Messagable{
    //Message getMessage(String message);
    void getMessage(String message);
}
class Message{
    Message(String message){
        System.out.println(message);
    }
}
public class MethodReferenceConstructor {
    public static void main(String [] args){
        Messagable hello= Message::new;
        hello.getMessage("hello");
    }
}
