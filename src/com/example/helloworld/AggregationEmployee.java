package com.example.helloworld;

public class AggregationEmployee {
    int id;
    String name;
    Address address;

    AggregationEmployee(int id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }
    public static void main(String[] args){
        Address ad1=new Address("Palakkad","Kerala","India");
        Address ad2=new Address("Thrissur","Kerala","India");

        AggregationEmployee e1= new AggregationEmployee(100,"Ajay",ad1);
        AggregationEmployee e2= new AggregationEmployee(120,"Vijay",ad2);

        e1.display();
        e2.display();
    }
}
