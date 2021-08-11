package Practical6.P6Q1;

import java.util.Scanner;

public class P6Q1 {
    public static void main(String[] args) {
        SavingAcc savAcc1 = new SavingAcc(123, 100, "3/5/21", 0.012);
        CurrentAcc curAcc1 = new CurrentAcc(123, 100, "3/5/21");

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        System.out.println(savAcc1.toString());
        System.out.println("\n" + curAcc1.toString());
        do {
            System.out.println("\nMenu");
            System.out.println("======");
            System.out.println("1.Deposit");
            System.out.println("2.Withdrawal");
            System.out.println("3.Calculate Interest Amount");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter Amount: ");
                double cash = scanner.nextDouble();
                savAcc1.deposit(cash);

                System.out.println("The balance is " + savAcc1.getBalance());

            } else if (choice == 2) {
                System.out.print("Enter Amount: ");
                double cash = scanner.nextDouble();
                savAcc1.withdrawal(cash);

                System.out.println("The balance is " + savAcc1.getBalance());

            } else if (choice == 3) {
                System.out.println("Interest is: RM" + savAcc1.calculateInterest());

            } else if (choice == 4) {
                System.out.println("GoodBye");
            } else {
                System.out.println("Invalid input");
            }
        } while (choice != 4);

    }
}
