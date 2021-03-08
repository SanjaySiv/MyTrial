package com.example.helloworld;

class GenericClass<X>{
    X name;
    public X getName(){
       return name;
    }
    public void setName(X name){
        this.name=name;
    }
    public String genericMethod(GenericClass<String>x){
        x.setName("John");
        return x.name;
    }
}
public class TypeInferenceExample2 {
    public static void main(String[] args){
        GenericClass<String>class1=new GenericClass<>();
        class1.setName("Peter");
        System.out.println(class1.getName());
        GenericClass<String>class2=new GenericClass<>();
        class2.setName("Peter");
        System.out.println(class2.getName());
        System.out.println(class2.genericMethod(new GenericClass<>()));
    }
}
