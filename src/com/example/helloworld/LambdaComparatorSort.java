package com.example.helloworld;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product{
    int id;
    String name;
    float price;
    public Product(int id,String  name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class LambdaComparatorSort {
    public static void main(String[] args){
        List<Product>list=new ArrayList<>();
        list.add(new Product(1,"Laptop",35000f));
        list.add(new Product(3,"Mobile",25000f));
        list.add(new Product(2,"Battery",1000f));
        list.add(new Product(4,"Headset",1500f));
        list.add(new Product(7,"TV",55000f));
        list.add(new Product(9,"Charger",2000f));
        System.out.println("Sorting by name of product");
        //Collections.sort(list,(p1,p2)->p1.name.compareTo(p2.name));
        //list.sort((p1, p2) -> p1.name.compareTo(p2.name));
        list.sort(Comparator.comparing(p -> p.name));
        list.forEach((n)->System.out.println(n));
        System.out.println("Sorting by price of product");
        list.sort((p1, p2) -> Float.compare(p1.price, p2.price));
        list.forEach((n)->System.out.println(n));
    }
}
