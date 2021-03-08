package com.example.helloworld;

import java.io.FileReader;

public class FileReaderClass {
    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("java.txt");
        int i;
        while ((i=fr.read())!=-1){
            System.out.print((char)i);
        }
        fr.close();
    }
}
