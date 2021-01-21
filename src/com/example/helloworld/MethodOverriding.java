package com.example.helloworld;
class Bank{
    int rateOfInterest(){
        return 0;
    }
}
class Sbi extends Bank{
    int rateOfInterest(){
        return 5;
    }
}
class Icici extends Bank{
    int rateOfInterest(){
        return 7;
    }
}
class Axis extends  Bank{
    int rateOfInterest(){
        return 9;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        Icici i = new Icici();
        Axis a = new Axis();
        System.out.println(s.rateOfInterest()+"%"); //rateOfInterest() is overridden
        System.out.println(i.rateOfInterest()+"%"); //rateOfInterest() is overridden
        System.out.println(a.rateOfInterest()+"%"); //rateOfInterest() is overridden
    }
}
