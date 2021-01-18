package com.example.helloworld;

public class CopyObjectCopyConst {
    int id,age;
    String name;
    CopyObjectCopyConst(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    CopyObjectCopyConst(CopyObjectCopyConst obj){
        id=obj.id;
        name= obj.name;
        age= obj.age;
    }
    void display(){
        System.out.println("id="+id+" Name="+name+" Age="+age);
    }
    public static void main(String[] args){
        CopyObjectCopyConst c1=new CopyObjectCopyConst(121,"Ajay",20);
        CopyObjectCopyConst c2=new CopyObjectCopyConst(c1);
        c1.display();
        c2.display();
    }
}
