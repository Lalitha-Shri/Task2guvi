class Person {
    int age;
    String name;
    Person()
    {
        this.age=18;
        this.name="abc";
    }
    Person(int age,String name) {
        this.age = age;
        this.name = name;
    }
    public void print() {
        if(age>=18){
        System.out.println("Name:" + name + " Age:" + age);}
        else{
            System.out.println("age should be greater than 18");
            this.age=18;
            System.out.println("Name:" + name + " Age:" + age);
        }
    }
}

public class Main {
    public static void main(String[] args)
    {
        Person p1= new Person(28,"John") ;
        Person p2=new Person(18,"Zack");
        Person p3=new Person( 17,"Jenni");
        Person p4=new Person();
        p1.print();p2.print();p3.print();p4.print();
        }
    }
