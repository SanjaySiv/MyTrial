package com.example.helloworld;

public class CloneObject implements Cloneable {
    int id;
    String name;

    CloneObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            CloneObject c1=new CloneObject(101,"Ajay");
            CloneObject c2=(CloneObject) c1.clone();
            System.out.println(c1.id+" "+c1.name);
            System.out.println(c2.id+" "+c2.name);
        } catch (CloneNotSupportedException c) {
        }
    }
}
