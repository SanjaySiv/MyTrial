package com.example.helloworld;

public class EncapTest {
    private String name;
    private int age;
    private int idNum;
    public void setName(String newName){
        name=newName;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    public void setIdNum(int newIdNum){
        idNum=newIdNum;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getIdNum() {
        return idNum;
    }
}
