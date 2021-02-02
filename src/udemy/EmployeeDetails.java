package udemy;

class Director{
    String name;
    int age;
    String  phoneNum;
    String address;
    double salary;
    Director(String name,int age,String phoneNum,String address,double salary){
        this.name=name;
        this.age=age;
        this.phoneNum=phoneNum;
        this.address=address;
        this.salary=salary;
    }
    void printSalary(){
        System.out.println(name+" "+age+" "+phoneNum+" "+address+" "+salary);
    }
}
class Employee extends Director{
    String specialization;
    Employee(String name, int age, String phoneNum, String address, double salary, String specialization){
        super(name,age,phoneNum,address,salary);
        System.out.println(this.specialization=specialization);
    }
}
class Manager extends Director{
    String department;
    Manager(String name,int age,String phoneNum,String address,double salary,String department){
        super(name,age,phoneNum,address,salary);
        System.out.println(this.department=department);
    }
}
public class EmployeeDetails {
    public static void main(String[] args){
    Employee employee=new Employee("joe",28,"9767754321","Palakkad",35500,"Hybris");
    employee.printSalary();
    Manager manager=new Manager("sarah",38,"8945564320","Trivandrum",67000,"Java");
    manager.printSalary();
    }
}