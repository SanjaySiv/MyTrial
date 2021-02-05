package com.example.helloworld;

class Camera{
    public void start(){
        System.out.println("Camera starting");
    }
}
class Nikon extends Camera{
    public void start(){
        System.out.println("Nikon camera starting");
    }
    public void snap(){
        System.out.println("Photo taken");
    }
}
public class UpDownCasting {
    public static void main(String[] args){
        Camera c=new Camera();
        Nikon n=new Nikon();
        Camera c1=new Nikon();//upcast
        //Nikon n1=new Camera(); can't do directly
        Nikon n2=(Nikon) c1;//downcast
        //Nikon n3=(Nikon) c;//exception  c object type is Camera
        c.start();
        n.start();
        n.snap();
        c1.start();
        ((Nikon) c1).snap();//subclass method calling with superclass reference variable
        n2.start();
        n2.snap();
    }
}