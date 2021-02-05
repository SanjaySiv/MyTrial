package com.example.helloworld;

public class NumericCasting {
    public static void main(String[] args){
        System.out.println(Short.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        byte b=127;
        short s=2345;
        int i=156795;
        long l=232546578;
        float f=376.2424f;
        double d=4256724;
        long l1=b;//widening
        byte b1=(byte)d;//narrowing
        System.out.println(b1);
        float f1=i;
        System.out.println(f1);
        int i1=(int)l;
        System.out.println(i1);
        int sum=(int)(b+d+l);
        System.out.println(sum);
    }
}
