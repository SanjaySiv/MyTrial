package udemy;
class AgeOfPerson{
    int age;
    AgeOfPerson(){
        System.out.println("Non parameterized constructor of superclass");
    }
    AgeOfPerson(int age){
        this.age=age;
    }
    public void getAge(){
        System.out.println("Age of person is "+age);
    }
}
public class Person extends AgeOfPerson{
    Person(){
        System.out.println("Non parameterized constructor of subclass");
    }
    Person(int age){
        super(age);
    }
    public static void main(String[] args){
        Person per=new Person(24);
        per.getAge();
        Person per1=new Person();
    }
}
