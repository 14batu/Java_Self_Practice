package jd07_class_object_task;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee employee1 =  new Employee();


        employee.name = "Batuhan";
        employee.age = 30;
        employee.gender = 'M';
        employee.jobTitle = "IT";
        employee.salary = 100_000;

        employee.work();

        System.out.println(employee);

        employee1.name = "Emir";
        employee1.salary = 150_000;
        employee1.gender = 'M';
        employee1.age = 23;
        employee1.jobTitle = "Bartender";

        employee1.work();

        System.out.println(employee1);




    }
}
