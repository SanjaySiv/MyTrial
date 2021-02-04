package com.example.helloworld;

class Animal{
    public void eating(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    public void eating(){
        System.out.println("Dog eating biscuit");
    }
}
class Cat extends Animal{
    public void eating(){
        System.out.println("Cat eating rat");
    }
}
class Lion extends Animal{
    public void eating(){
        System.out.println("Lion eating meat");
    }
}
public class TestPolymorphism {
    public static void main(String[] args){
        Animal a;
        a=new Dog();
        a.eating();
        a=new Cat();
        a.eating();
        a=new Lion();
        a.eating();
    }
}
