package Practical5;

import java.util.Scanner;

public class P5Q2 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        str = scanner.next();

        str = str.toUpperCase();
        // str.replaceAll("[AEIOU]", "x");
        str = str.replace('A', 'x');
        str = str.replace('E', 'x');
        str = str.replace('I', 'x');
        str = str.replace('O', 'x');
        str = str.replace('U', 'x');

        System.out.print("Modified String: " + str);
        scanner.close();

    }
}
