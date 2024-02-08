package jday13_inheritence_practice_task.student_task;

public class GraduateStudent extends SecondStudent {
    public GraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println("Graduate Student : " + getName() + " " + getSchoolName());
    }
}
