package Practical4.Q2;

public class P4Q2 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudID("ABC001");
        s1.setName("Steven");
        s1.addQuiz(9);
        s1.addQuiz(9);
        s1.setContributionPercentage(20);

        Student s2 = new Student("ABC002", "Watoto");
        s2.addQuiz(10);
        s2.addQuiz(9);

        System.out.println(s1.getName() + "(" + s1.getStudID() + ") has taken " + s1.getNumOfQuizTaken()
                + " quizs with the total score and average score of " + s1.getTotalScore() + ", "
                + s1.getAverageScore());
        System.out.println(s1.getName() + "(" + s1.getStudID() + ") obtained coursework marks of "
                + Student.getContributionPercentage() * s1.getTotalScore() + " in semester 1");
        System.out.println(s1.getName() + "(" + s1.getStudID() + ") obtained coursework marks of "
                + Student.getContributionPercentage() * s1.getTotalScore() + " in semester 2");

    }

}
