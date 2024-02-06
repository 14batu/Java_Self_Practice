package jday11_oop_practice_task;

public class CydeoStudentClient {
    public static void main(String[] args) {
        CydeoStudent cydeoStudent = new CydeoStudent("Batuhan",31,85,12345,33);

        CydeoStudent.schoolName = "Cydeo";
        CydeoStudent.programmingLanguage = "Java";

        cydeoStudent.attendClass();
        cydeoStudent.study();

        CydeoStudent.printProgramLang();
        CydeoStudent.printSchoolName();

        System.out.println(cydeoStudent);

    }
}
