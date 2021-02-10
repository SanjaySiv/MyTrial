package com.example.helloworld;

import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String [] args){
        try{
            File file=new File("Java.txt");
            if(file.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("File already exist");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        File f=new File("E:\\Training\\MyTrial");
        System.out.println(f);
        String[] fileNames=f.list();
        assert fileNames != null;
        for(String str:fileNames){
            System.out.println(str);
        }
        File[] fileName=f.listFiles();
        assert fileName != null;
        for(File file:fileName){
            System.out.println(file.getName()+" length:"+file.length());
        }
    }
}
