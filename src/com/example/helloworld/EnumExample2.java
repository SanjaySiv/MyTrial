package com.example.helloworld;

enum Seasons{WINTER, SUMMER, FALL, SPRING}
public class EnumExample2 {
    public static void main(String[] args){
        Seasons s= Seasons.WINTER;
        System.out.println(s);
        for(Seasons en: Seasons.values()){
            System.out.println(en);
        }
    }
}
