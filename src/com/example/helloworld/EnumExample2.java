package com.example.helloworld;

enum Season{WINTER, SUMMER, FALL, SPRING}
public class EnumExample2 {
    public static void main(String[] args){
        Season s=Season.WINTER;
        System.out.println(s);
        for(Season en:Season.values()){
            System.out.println(en);
        }
    }
}
