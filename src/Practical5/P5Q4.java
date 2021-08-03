package Practical5;

import java.util.Scanner;

public class P5Q4 {
    public static boolean isValid(String password) {
        int numOfDigit = 0, numOfLetter = 0;

        if (password.length() < 7)
            return false;

        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i)))
                return false;

            if (Character.isDigit(password.charAt(i)))
                numOfDigit++;
            else
                numOfLetter++;
        }

        if (numOfDigit < 1 || numOfLetter < 1)
            return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        System.out.print("Enter a password: ");
        password = scanner.next();

        if (isValid(password) == true) {
            System.out.println("Valid Password.");
        } else {
            System.out.print("Invalid Password.");
        }
        scanner.close();
    }
}
