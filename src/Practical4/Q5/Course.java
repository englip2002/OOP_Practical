package Practical4.Q5;

public class Course {
    final int LIMIT = 100;

    private String courseTitle;
    private double feePerStudent;
    private int noOfStudent = 0;
    private String[] studentName = new String[LIMIT];
    private static int courseCount = 10;

    Course(String courseTitle, double feePerStudent) {
        this.courseTitle = courseTitle;
        this.feePerStudent = feePerStudent;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public double getFeePerStudent() {
        return feePerStudent;
    }

    public void setFeePerStudent(double feePerStudent) {
        this.feePerStudent = feePerStudent;
    }

    public int getNoOfStudent() {
        return noOfStudent;
    }

    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }

    public String[] getStudentName() {
        return studentName;
    }

    public double calcFeesCollected() {
        return feePerStudent * noOfStudent;
    }

    public void addStudent(String studName) {
        this.studentName[noOfStudent] = studName;
        noOfStudent++;
    }

    public String toString() {
        return ("Course Title: " + courseTitle + "\nFee per student: " + feePerStudent + "\nNo of Student: "
                + noOfStudent + "\nCourse count: " + courseCount);
    }

}
