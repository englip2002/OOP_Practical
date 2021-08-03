package Practical4.Q2;

public class Student {
    private String studID, name;
    private int numOfQuiz;
    private double totalScore=0;
    private static double contributionPercentage;

    // A no-arg constructor
    public Student() {
    }

    // A constructor with 2 parameters for student ID and name
    public Student(String studID, String name) {
        this.studID = studID;
        this.name = name;
    }

    // accessors for all data fields (getter)
    public String getStudID(){
        return studID;
    }

    public String getName(){
        return name;
    }

    public int getNumOfQuizTaken(){
        return numOfQuiz;
    }

    public double getTotalScore(){
        return totalScore;
    }

    public static double getContributionPercentage(){
        return contributionPercentage;
    }

    // mutator for all data (setter) 
    public void setStudID(String studID) {
        this.studID = studID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfQuizTaken(int numOfQuiz) {
        this.numOfQuiz = numOfQuiz;
    }

    public void setScore(int totalScore) {
        this.totalScore=totalScore;
    }

    public void addQuiz(int score){
        this.numOfQuiz++;
        this.totalScore+=score;
    }

    public void setContributionPercentage(double contributionPercentage) {
        Student.contributionPercentage=contributionPercentage/20;
    }

    public double getAverageScore(){
        return totalScore/numOfQuiz;
    }

}
