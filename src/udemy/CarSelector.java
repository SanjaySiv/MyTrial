package udemy;

import java.util.Scanner;

public class CarSelector {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Do you want a car? (yes or no)");
        String wantCar=ob.nextLine();
        if(wantCar.equals("yes")){
            System.out.println("Which is your favorite color between red-blue?");
            String  carColor=ob.nextLine();
            if(wantCar.equals("red")){
                System.out.println("We have it in stock. Would you like to see it?(yes/no)");
                String wantToSee=ob.nextLine();
                if(wantToSee.equals("yes")){
                    System.out.println("Great! Let's check the car");
                }
                else{
                    System.out.println("No worries we'll check something else");
                }
            }
            else if(wantCar.equals("blue")){
                System.out.println("We can order it");
            }
            else{
                System.out.println("Sorry we don't have it in stock");
            }
        }
        else{
            System.out.println("No worries have a good day!");
        }
    }
}
