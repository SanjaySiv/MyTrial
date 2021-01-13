package com.example.helloworld;

class Details{
    String name;
    int age;

    int calculateYearsToRetirement(){
        int yr = 65 - age;
        return yr;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
}

public class GetterAndReturn {
    public static void main(String[] args){
        Details d=new Details();
        d.age=37;
        d.name="Joe";
        int year=d.calculateYearsToRetirement();
        int age=d.getAge();
        String name=d.getName();
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Years left for retirement : "+year);
    }
}
