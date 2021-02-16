package com.example.helloworld;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderClass1{
    public static void main(String [] args) throws Exception{
        FileReader fr=new FileReader("java.txt");
        BufferedReader br=new BufferedReader(fr);
        int i;
        while ((i=br.read())!=-1){
            System.out.print((char)i);
        }
        br.close();
        fr.close();
    }
}
