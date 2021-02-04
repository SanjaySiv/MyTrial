package com.example.helloworld;
class Car{
    public int speedLimit=90;
}
public class Honda extends Car{
    public int speedLimit=120;
    public static void main(String[] args){
        Car c=new Honda();
        System.out.println(c.speedLimit);//runtime polymorphism not achieved by data members
    }
}
