package jday13_inheritence_practice_task.employee_task;

public class EmployeeClient {
    public static void main(String[] args) {

        Employee employee = new Employee("Batuhan","1","STED",100_000,"Cydeo");
        employee.work();

        Developer developer = new Developer("Aysun","2","QA",111_000,"BAU","Java");
        developer.work();

        Teacher teacher = new Teacher("Muhtar","3","Web",54_000,"Cydeo");
        teacher.work();

        Tester tester=  new Tester("Asia","1","Soft Skill",60_000,"Cyber Tek");
        tester.work();




    }


}
