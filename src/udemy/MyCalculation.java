package udemy;
class Calculation{
    int z;
    public void addition(int x,int y){
        z=x+y;
        System.out.println("Sum of given numbers = "+z);
    }
    public void subtraction(int x,int y){
        z=x-y;
        System.out.println("Difference of given numbers  = "+z);
    }
}
public class MyCalculation extends Calculation{
    public void multiplication(int x,int y){
        z=x*y;
        System.out.println("product of given numbers = "+z);
    }
    public static void main(String[] args){
        MyCalculation myCal=new MyCalculation();
        int x=20,y=15;
        myCal.addition(x,y);
        myCal.subtraction(x,y);
        myCal.multiplication(x,y);
        Calculation cal=new MyCalculation();    //superclass reference variable holding subclass object
        cal.addition(x,y);
        cal.subtraction(x,y);
        //cal.multiplication(x,y); superclass reference variable can only access superclass members
    }
}
