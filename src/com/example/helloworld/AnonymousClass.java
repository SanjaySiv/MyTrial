package com.example.helloworld;

abstract class Persons{
    abstract void eat();
    public void run(){
        System.out.println("Running");
    }
}
interface Plants{
    void grow();
}
public class AnonymousClass {
    public static void main(String [] args){
        Persons p=new Persons() {
            @Override
            public void eat() {
                System.out.println("Person eating");
            }
            public void run(){
                System.out.println("Person running");
            }
        };
        p.eat();
        p.run();
        Plants p1=new Plants() {
            @Override
            public void grow() {
                System.out.println("Plant growing");
            }
        };
        p1.grow();
    }
}
