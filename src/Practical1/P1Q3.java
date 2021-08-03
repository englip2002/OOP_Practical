package Practical1;
import java.util.Arrays;
import java.util.Scanner;

public class P1Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Q3 83589795
        int userCardNum, cardNum, i;
        int[] numOfCard = new int[8];
        int sumFromRightDigit = 0;
        int[] doubledDigit = new int[4];
        int sumDoubledDigit = 0;
        int overallSum = 0;
        int correctedCardNum = 0;

        System.out.print("Enter card number: ");
        userCardNum = scanner.nextInt();

        // to not change the original userCardNum
        cardNum = userCardNum;

        // seperate the numbers and store in array
        for (i = 7; i >= 0; i--) {
            numOfCard[i] = cardNum % 10;
            cardNum = cardNum / 10;
        }
        System.out.println(Arrays.toString(numOfCard));

        // to find sum of digit 7,5,3,1 number
        sumFromRightDigit = numOfCard[7] + numOfCard[5] + numOfCard[3] + numOfCard[1];

        // to find 2 times of 0,2,4,6th digit
        doubledDigit[3] = numOfCard[6] * 2;
        doubledDigit[2] = numOfCard[4] * 2;
        doubledDigit[1] = numOfCard[2] * 2;
        doubledDigit[0] = numOfCard[0] * 2;

        for (i = 0; i < 4; i++) {
            //get first digit then sum
            sumDoubledDigit += doubledDigit[i] % 10;
            //get second digit then sum
            doubledDigit[i] = doubledDigit[i] / 10;
            sumDoubledDigit += doubledDigit[i] % 10;
        }

        overallSum = sumDoubledDigit + sumFromRightDigit;

        if (overallSum % 10 == 0)
            System.out.println("Valid");
        else {
            correctedCardNum = userCardNum + ((cardNum - overallSum) % 10);
            System.out.print("The valid Card NUmber should be " + correctedCardNum + ".");
        }

        scanner.close();
    }
}
