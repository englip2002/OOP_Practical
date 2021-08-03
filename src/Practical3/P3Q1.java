package Practical3;

import java.util.Scanner;

public class P3Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfQuiz, i , aboveAvg = 0, belowAvg = 0;
        double total = 0;
        double average = 0;

        System.out.print("Enter number of quiz scores to process: ");
        numOfQuiz = scanner.nextInt();

        double[] scores = new double[numOfQuiz];

        // get total and count average
        for (i = 0; i < scores.length; i++) {
            System.out.printf("Score %d: ", i + 1);
            scores[i] = scanner.nextDouble();
            total += scores[i];
        }
        average = (double)total / numOfQuiz;

        // identify which num is higher or lower than average
        for (i = 0; i < numOfQuiz; i++) {
            if (scores[i] >= average)
                aboveAvg++;
            else
                belowAvg++;
        }

        System.out.println("\n Results");
        System.out.println("===================");
        System.out.printf("Average is %.2f\n", average);
        System.out.printf("Number of scores above or equal to the average is %d\n", aboveAvg);
        System.out.printf("Number of scores below the average is %d\n", belowAvg);

        scanner.close();
    }

}
