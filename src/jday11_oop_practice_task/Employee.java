package jday11_oop_practice_task;

public class Employee {
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;




    public Employee(String name){
        this.name = name;
    }

    public Employee(String name,int age,double salary){
        this(name);
        this.age = age;
        this.salary = salary;
    }
    public Employee(String name, int age, char gender, String jobTitle, double salary) {
        this(name,age, salary);
        this.gender = gender;
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
