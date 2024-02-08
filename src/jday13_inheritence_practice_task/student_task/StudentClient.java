package jday13_inheritence_practice_task.student_task;

public class StudentClient {
    public static void main(String[] args) {
        GraduateStudent graduateStudent = new GraduateStudent("Batuhan",30,"Male","1","IT",'A',"Cydeo");
        System.out.println(graduateStudent);
        graduateStudent.study();

        CydeoStudent cydeoStudent = new CydeoStudent("Emir",21,"Male","2","CS",'B',"BAU",1,1,"Java");
        System.out.println(cydeoStudent);
        cydeoStudent.study();

        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Batuhan",30,"Male","1","IT",'A',"UMBC");
        System.out.println(undergraduateStudent);
        undergraduateStudent.study();
    }
}
