package Practical5.P5Q5;

public class Student {
    private String studentID;
    private String name;
    private String school;

    public Student(String studentID, String name, String school) {
        this.studentID = studentID;
        this.name = name;
        this.school = school;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public static boolean validateStudentID(Student student) {
        char[] schoolCode = { 'A', 'B' };
        String[] schoolDesc = { "FASC", "FAFB" };

        if (student.studentID.length() != 6)
            return false;

        if (Character.isLetter(student.studentID.charAt(0)) == false)
            return false;

        for (int i = 1; i < 6; i++)
            if (Character.isDigit(student.studentID.charAt(i)) == false)
                return false;

        for (int i = 0; i < 2; i++) {
            if (student.studentID.charAt(0) == schoolCode[i])
                if (student.school != schoolDesc[i])
                    return false;
        }
        return true;
    }

}
