package Practical2;
import java.util.Scanner;

public class P2Q2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double userIn;
        System.out.print("Enter Number: ");
        userIn = scanner.nextDouble();

        System.out.printf("The Square Root is %.8f", sqrt(userIn));
        scanner.close();
    }

    public static double sqrt(double userInput) {

        double upperLimit, lowerLimit, midpoint = 0;

        if (userInput == 0 || userInput == 1) {
            return userInput;
        }
        else if (userInput > 1) {
            upperLimit = userInput;
            lowerLimit = 1;
        } else {
            upperLimit = 1;
            lowerLimit = userInput;
        }

        while (((upperLimit - lowerLimit) / lowerLimit) >= 1.0e-8) {
            midpoint = getMidpoint(upperLimit, lowerLimit);

            if (getSquare(midpoint) > userInput)
                upperLimit = midpoint;
            if (getSquare(midpoint) < userInput)
                lowerLimit = midpoint;
        }
        return midpoint;
    }

    public static double getMidpoint(double upper, double lower) {
        return (upper + lower) / 2;
    }

    public static double getSquare(double midpoint) {
        return Math.pow(midpoint, 2);
    }
}

