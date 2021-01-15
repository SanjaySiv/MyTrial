package com.example.helloworld;

public class ConcatHashCodeCheck {
    public static void main(String[] args){
        System.out.println("Hashcode test of String:");
        String str="Java";
        System.out.println(str.hashCode());
        str+="tPoint";
        System.out.println(str.hashCode());

        System.out.println("HashCode test of StringBuffer");
        StringBuilder sb=new StringBuilder("Java");
        System.out.println(sb.hashCode());
        sb.append("tPoint");
        System.out.println(sb.hashCode());

        System.out.println("HashCode test of StringBuffer");
        StringBuffer sbr=new StringBuffer("Java");
        System.out.println(sbr.hashCode());
        sb.append("tPoint");
        System.out.println(sbr.hashCode());
    }
}
