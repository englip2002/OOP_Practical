package Practical5.P5Q5;

public class P5Q5 {
    public static void main(String[] args) {
        Student student = new Student("A12345", "Tan", "FASB");
        System.out.println(Student.validateStudentID(student));
    }

}
