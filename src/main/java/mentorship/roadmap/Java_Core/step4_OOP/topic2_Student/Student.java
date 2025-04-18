package mentorship.roadmap.Java_Core.step4_OOP.topic2_Student;

import mentorship.roadmap.Java_Core.step4_OOP.topic1_Person.Person;

public class Student extends Person {

    private String studentId;

    public Student(String name, int age, String studentId) {

        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId() {
        this.studentId = studentId;
    }

    @Override

    public void displayInfo() {
        System.out.println("Name: " + this.getName() + ", Age: " + this.getAge() +
                "  Student ID: " + this.getStudentId());
    }
}
