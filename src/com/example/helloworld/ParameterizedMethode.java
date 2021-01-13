package com.example.helloworld;
class Robot{
    public void speak(String text){
        System.out.println(text);
    }
    public void jump(int height){
        System.out.println("Jumping "+height);
    }
    public void move(String direction,double distance){
        System.out.println("Moving "+distance+ " m in "+direction+" direction");
    }
}
public class ParameterizedMethode {
    public static void main(String[] args){
        Robot ob=new Robot();
        ob.speak("HI there");
        ob.jump(10);
        ob.move("South",23.45);

        String greeting="Bye";      //another way to pass parameters to a method
        ob.speak(greeting);
    }
}
