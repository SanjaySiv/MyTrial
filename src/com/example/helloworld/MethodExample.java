package com.example.helloworld;

class Person1{
    String name;
    int age;

    void speak(){
        System.out.println("My name is "+name+" and I am "+age+" years old");
    }

    void hello(){
        System.out.println("Hi there !");
    }

}

public class MethodExample {
    public static void main(String []args){
        Person1 ob=new Person1();
        ob.name="Joe";
        ob.age=35;
        ob.hello();
        ob.speak();
    }
}
