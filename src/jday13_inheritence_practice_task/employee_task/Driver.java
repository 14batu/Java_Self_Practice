package jday13_inheritence_practice_task.employee_task;

public class Driver extends Employee{


    public Driver(String name, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work(){
        System.out.println(getJobTitle() + " " + getName() + " is Driving");
    }
}
