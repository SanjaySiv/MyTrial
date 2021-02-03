package udemy;
class SuperClass{
    int x=20;
    public void display(){
        System.out.println("Display method of superclass");
    }
}
public class SubClass extends SuperClass{
    int x=5;
    public void display(){
        System.out.println("Display method of subclass");
    }
    void myMethod(){
        display();
        super.display();
        System.out.println("value of x in subclass : "+x);
        System.out.println("value of x in superclass : "+super.x);
    }
    public static void main(String[] args){
        SubClass obj=new SubClass();
        obj.myMethod();
        //super.display(); can not use super in static context
    }
}
