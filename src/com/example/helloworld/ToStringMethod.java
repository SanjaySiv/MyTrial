package com.example.helloworld;
class Sample{
    private int id;
    private String name;
    public Sample(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        StringBuffer sb=new StringBuffer();
        sb.append(id).append(" ").append(name);
        return sb.toString();
        //return id+" "+name;
    }
}
public class ToStringMethod {
    public static void main(String[] args){
        Sample s1= new Sample(111,"ajay");
        Sample s2=new Sample(121,"vijay");
        System.out.println(s1);
        System.out.println(s2);
    }
}
