package udemy;

import java.util.Scanner;

public class Exam {
    void test(){
        Scanner scan=new Scanner(System.in);
        int markScored=0,questionCount=0;
        System.out.println("Enter you name : ");
        String name=scan.nextLine();
        if(name.isBlank()){
            System.out.println("Name can't be empty");
            test();
        }
        System.out.println("Hi "+name+" welcome to the test. All the best");
        System.out.println("Question "+questionCount+": 20+45=?");
        String ans1=scan.nextLine();
        questionCount+=1;
        if(ans1.equals("65")){
            markScored += 1;
        }
        System.out.println("Question "+questionCount+": India's capital");
        String ans2=scan.nextLine();
        questionCount+=1;
        if(ans2.equalsIgnoreCase("Delhi")){
            markScored += 1;
        }
        System.out.println("Question "+questionCount+": 20*5=?");
        String ans3=scan.nextLine();
        questionCount+=1;
        if(ans3.equals("100")){
            markScored++;
        }
        System.out.println("Hi "+name+", you have scored "+markScored+"/"+questionCount);
    }
    public static void main(String[] args){
    Exam exam=new Exam();
    exam.test();
    }
}
