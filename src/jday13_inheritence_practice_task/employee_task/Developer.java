package jday13_inheritence_practice_task.employee_task;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String employeeId, String jobTitle, double salary, String companyName, String programmingLanguage) {
        super(name, employeeId, jobTitle, salary, companyName);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.isBlank() || programmingLanguage.isBlank()) {
            System.err.println("Programming language cannot be blank, empty or null");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is coding in " + getProgrammingLanguage());
    }
}
