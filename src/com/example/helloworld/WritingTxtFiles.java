package com.example.helloworld;

import java.io.*;

public class WritingTxtFiles {
    public static void main(String [] args){
        File file=new File("Java.txt");
        try(BufferedWriter br=new BufferedWriter(new FileWriter(file))){
            br.write("Hi");
            br.newLine();
            br.write("This is a text file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
