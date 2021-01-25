package com.example.helloworld;
interface Drawable{
    void draw();
}
class Circle implements Drawable{
   public void draw(){
        System.out.println("Drawing circle");
    }
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
public class InterfaceExample {
    public static void main(String[] args){
        Drawable c1=new Circle();
        c1.draw();
        Circle c2=new Circle();
        c2.draw();
        Drawable r=new Rectangle();
        r.draw();
    }
}
