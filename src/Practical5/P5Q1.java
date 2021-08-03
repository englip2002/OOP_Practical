package Practical5;

import java.util.Scanner;

public class P5Q1 {
    public static int countLetter(String str, char ch) {
        int numOfRepeat = 0;
        for (int i = 0; i < str.length(); i++) {
            Character ch1 = str.charAt(i);

            //ch1.compareTo(ch)==0
            if (ch1.equals(ch) == true)
                numOfRepeat++;
        }

        return numOfRepeat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        char ch;

        System.out.print("Enter a word: ");
        str = scanner.next();
        System.out.print("Enter the letter you want to count: ");
        ch = scanner.next().charAt(0);
        System.out.print(str + " contains " + countLetter(str, ch) + ch);
        scanner.close();

    }
}
