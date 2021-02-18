package com.example.helloworld;

public class EnumExample5 {
    enum Day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
    public static void main(String[] args){
        Day day=Day.MONDAY;
        switch (day){
            case SUNDAY:
                System.out.println("Sunday");
                break;
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}
