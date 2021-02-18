package com.example.helloworld;

public class EnumExample4 {
    enum Season{WINTER(5),SUMMER(10),FALL(50),SPRING(7);
        private final int i;
        Season(int i) {
            this.i=i;
        }
    }
    public static void main(String[] args){
        for(Season s:Season.values()){
            System.out.println(s+" "+s.i);
        }
    }
}
