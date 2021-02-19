package com.example.helloworld;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args){
        Student s=new Student(121,"Ram");
        System.out.println("Writing....");
        try(FileOutputStream fOut=new FileOutputStream("student.txt")){
            ObjectOutputStream out=new ObjectOutputStream(fOut);
            out.writeObject(s);
            out.flush();
            out.close();
            System.out.println("Success");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
