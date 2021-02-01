package udemy;

import java.util.Scanner;

public class GradeCalculator {
    public void calculate(double[] marks){
        double sum=0;
        for (double mark : marks) {
            sum += mark;
        }
        double percentage=sum/(marks.length);
        System.out.println("You gained a total of "+sum+" marks out of "+(marks.length*100));
        if(percentage>=90){
            System.out.println("O");
        }
        else if(percentage<90&&percentage>=80){
            System.out.println("A");
        }
        else if(percentage<80&&percentage>=70){
            System.out.println("B");
        }
        else if(percentage<70&&percentage>=60){
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println("Percentage : "+percentage+"%");
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of courses : ");
        int numOfCourses=scan.nextInt();
        double[] marksList=new double[numOfCourses];
        System.out.println("Enter your marks out of 100");
        for(int i=0;i<numOfCourses;i++){
            marksList[i]=scan.nextDouble();
            if(marksList[i]>100||marksList[i]<0){
                System.out.println("Enter a valid mark");
                i-=1;
            }
        }
        GradeCalculator ob=new GradeCalculator();
        ob.calculate(marksList);
    }
}
