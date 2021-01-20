package com.example.helloworld;

public class FormatSpecifiers {
    public static void main(String[] args){
        String str1=String.format("%d",101);
        String str2=String.format("%s",101);
        String str3=String.format("%f",101.345);
        String str4=String.format("%x",12);
        String str5=String.format("%c",'c');
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);

        String str6=String.format("%d",111);
        String str7=String.format("|%d|",111);
        String str8=String.format("|%-5d|",111);
        String str9=String.format("|%10d|",111);
        String str10=String.format("|%-10d|",111);
        String str11=String.format("|%010d|",111);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
        System.out.println(str9);
        System.out.println(str10);
        System.out.println(str11);

    }
}
