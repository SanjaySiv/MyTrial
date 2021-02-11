package com.example.helloworld;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample2 {
    public static void main(String[] args){
        File file=new File("text.txt");
        try{
            FileReader fr=new FileReader(file);
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
