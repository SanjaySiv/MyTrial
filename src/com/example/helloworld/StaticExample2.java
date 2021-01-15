package com.example.helloworld;
class StudentDetails{
    String name;
    int rollNum;
    static String clg;
    static int count;

    StudentDetails(String name){
        this.name=name;
        rollNum=setRollNum();
    }
    static int setRollNum(){
        count++;
        return count;
    }

    static void setClg(String c){
        clg=c;
    }
    void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Roll num : "+this.rollNum);
        System.out.println("College name : "+clg);
    }
}
public class StaticExample2 {
    public static void main(String [] args) {
        StudentDetails.setClg("IIT");
        StudentDetails s1 = new StudentDetails("Karan");
        StudentDetails s2 = new StudentDetails("Aryan");
        s1.display();
        s2.display();
        StudentDetails.setClg("ITI");
        StudentDetails s3 = new StudentDetails("Ryan");
        s3.display();
    }
}
