package Practical1;
import java.util.Scanner;

public class P1Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // constant
        final int DAYS_IN_YEAR = 365;
        final int SECONDS_IN_DAY = 81600;

        int age, ageYears, ageDays, ageSeconds;
        System.out.print("Enter your age (Years):");
        age = scanner.nextInt();
        ageYears = age;
        ageDays = age * DAYS_IN_YEAR;
        ageSeconds = age * SECONDS_IN_DAY * DAYS_IN_YEAR;

        System.out.println("Age in years: " + ageYears + " yaers");
        System.out.println("Age in days: " + ageDays + " days");
        System.out.println("Age in seconds: " + ageSeconds + " seconds");

        // to close scanner to avoid resource leaking
        scanner.close();

    }
}
