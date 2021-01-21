package com.example.helloworld;

class Calculation{
    int z;
    void addition(int x,int y){
        z=x+y;
        System.out.println(x+"+"+y+"="+z);
    }
    void subtraction(int x,int y){
        z=x-y;
        System.out.println(x+"-"+y+"="+z);
    }
}

public class MyCalculation extends Calculation {
    void multiplication(int x,int y){
        z=x*y;
        System.out.println(x+"*"+y+"="+z);
    }
    public static void main(String[] args){
        int a=10,b=4;
        MyCalculation m=new MyCalculation();
        m.addition(a,b);
        m.subtraction(a,b);
        m.multiplication(a,b);
        Calculation c=new Calculation();
        //c.multiplication(a,b);  parent class can't call child class members
    }
}
