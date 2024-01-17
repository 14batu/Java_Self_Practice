package jd07_class_object_task;

public class Employee {
    String name;
    int age;
    char gender;
    String jobTitle;
    double salary;

    public  void work(){
        System.out.println(jobTitle + " " + name + " is working");
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
