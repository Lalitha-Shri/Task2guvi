import java.util.Scanner;

class Person1 {
    String name;
    int age;
    Person1(String name,int age)
    {
       this.name=name;
       this.age=age;
    }

}
class Employee extends Person1{
    int empid,salary;
    Employee(int empid,int salary,String name,int age) {
        super(name, age);
        this.empid = empid;
        this.salary = salary;
    }

        public void display(){
        System.out.println("Employee name "+name+" Employee age "+age+" Employee ID "+ empid +" Employee Salary "+salary);
    }


}
public class Efg{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee id");
        int empid=sc.nextInt();
        System.out.println("Enter the employee name");
        String name=sc.next();
        System.out.println("Enter the employee age");
        int age=sc.nextInt();
        System.out.println("Enter the employee salary");
        int salary=sc.nextInt();
        Employee emp=new Employee(empid,salary,name,age);
        emp.display();
    }
}
