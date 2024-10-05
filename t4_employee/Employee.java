public class Employee{
    public static void main(String[] args){
        Manager ram = new Manager("Sri Ram", 48);
        ram.getName();
        ram.getAge();
        ram.salary();
        ram.work();
    }
}

interface EmployeeInterface{
    public void work();
    public int salary();
}

abstract class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract String getName();
    public abstract int getAge();
}

class Manager extends Person implements EmployeeInterface{
    public Manager(String name, int age){
        super(name, age);
    }
    public String getName(){
        System.out.println("The Manager's name is " + this.name);
        return this.name;
    }

    public int getAge(){
        System.out.println("The Manager's age is " + this.age);
        return this.age;
    }

    public void work(){
        System.out.println(this.name + " is working now.");
    }

    public int salary(){
        System.out.println("Salary is 90000 per month.");
        return 90000;
    }
}