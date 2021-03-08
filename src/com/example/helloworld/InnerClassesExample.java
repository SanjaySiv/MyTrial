package com.example.helloworld;

class Outer {
    void outerMethod() {
        int x = 7;
        class Inner {
            void innerMethod() {
                System.out.println(x);//from JDK 1.8 it's possible to access non-final variable in an inner class
            }
        }
        Inner in = new Inner();
        in.innerMethod();
    }
}
public class InnerClassesExample {
    public static void main(String[] args){
        Outer out=new Outer();
        out.outerMethod();
    }
}
