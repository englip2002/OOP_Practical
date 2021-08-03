package Practical1;
import java.util.Scanner;

public class P1Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Q1
        String name = "";
        int yearOfStudy;
        double GPA;

        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter your year of study: ");
        yearOfStudy = scanner.nextInt();
        System.out.print("What is your target GPA for this semester? ");
        GPA = scanner.nextDouble();

        System.out.println("Welcome " + name);
        System.out.println(
                "Work hard to achieve your target GPA of " + GPA + " this semester of your Year " + yearOfStudy);

        // to close scanner to avoid resource leaking
        scanner.close();
    }
}
