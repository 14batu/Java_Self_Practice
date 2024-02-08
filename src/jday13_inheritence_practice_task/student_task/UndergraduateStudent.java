package jday13_inheritence_practice_task.student_task;

public class UndergraduateStudent extends SecondStudent{
    public UndergraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println("Undergraduate Student : " + getName() + " " + getSchoolName());
    }
}
