package com.example.helloworld;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String [] args){
        System.out.println("Reading...");
        try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("student.txt"))){
            Student s=(Student)in.readObject();
            System.out.println(s.id+"  "+s.name);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
