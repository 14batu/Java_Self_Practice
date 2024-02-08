package jday13_inheritence_practice_task.employee_task;

public class Employee {

    private String name;
    private String employeeId;
    private String jobTitle;
    private double salary;
    private String companyName;


    public Employee(String name, String employeeId, String jobTitle, double salary, String companyName) {
        setName(name);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (employeeId == null || employeeId.isBlank() || employeeId.isBlank()){
            System.err.println("Employe Id cannot be blank, empty or null");
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.isBlank() || jobTitle.isBlank()){
            System.err.println("Job Title cannot be blank, empty or null");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0 ){
            System.err.println("Salary cannot be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName == null || companyName.isBlank() || companyName.isBlank()){
            System.err.println("Company name cannot be blank, empty or null");
            System.exit(1);
        }
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isBlank()){
            System.err.println("name cannot be blank, empty or null");
            System.exit(1);
        }
        this.name = name;
    }

    public void work(){
        System.out.println(getJobTitle() + " " + getName());
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
