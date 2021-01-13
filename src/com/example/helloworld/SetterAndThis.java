package com.example.helloworld;

class Frog{
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}

public class SetterAndThis {
    public static void main(String[] args){
        Frog f=new Frog();
        f.setName("Bertie");
        f.setAge(2);

        System.out.println(f.getName());
        System.out.println(f.getAge());
    }
}
