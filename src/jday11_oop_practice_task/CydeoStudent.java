package jday11_oop_practice_task;

public class CydeoStudent {
    public String name;
    public int age;
    public int grade;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public static String programmingLanguage;

    public CydeoStudent(String name, int age, int grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
    public void study (){
        System.out.println(name + " is working");
    }
    public void attendClass(){
        System.out.println(name + " is attending the live class");
    }
    public static void printSchoolName(){
        System.out.println(schoolName);
    }
    public static void printProgramLang(){
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", schoolName=" + schoolName +
                ", programming language=" + programmingLanguage +
                '}';
    }
}
