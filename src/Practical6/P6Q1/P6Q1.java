package Practical6.P6Q1;

import java.util.Scanner;

public class P6Q1 {
    public static void main(String[] args) {
        SavingAcc savAcc1 = new SavingAcc(123, 100, "3/5/21");
        CurrentAcc curAcc1 = new CurrentAcc(123, 100, "3/5/21");

        System.out.println(savAcc1.toString());
        System.out.println("\n" + curAcc1.toString());

        System.out.println("Account choice: ");
        System.out.println("1.Saving Account ");
        System.out.println("2.Current Account ");
        System.out.print("Enter account choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;


        if (scanner.nextInt() == 1) {
            do {
                System.out.println("\nMenu");
                System.out.println("======");
                System.out.println("1.Deposit");
                System.out.println("2.Withdrawal");
                System.out.println("3.Calculate Interest");
                System.out.println("4.Add Interest");
                System.out.println("5.Exit");
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
                    savAcc1.addInterest();
                    System.out.println("The balance is " + savAcc1.getBalance());

                } else if (choice == 5) {
                    System.out.println("GoodBye");

                } else {
                    System.out.println("Invalid input");
                }
            } while (choice != 4);
            
        } else{
            do {
                System.out.println("\nMenu");
                System.out.println("======");
                System.out.println("1.Deposit");
                System.out.println("2.Withdrawal");
                System.out.println("3.Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.print("Enter Amount: ");
                    double cash = scanner.nextDouble();
                    curAcc1.deposit(cash);

                    System.out.println("The balance is " + curAcc1.getBalance());

                } else if (choice == 2) {
                    System.out.print("Enter Amount: ");
                    double cash = scanner.nextDouble();
                    curAcc1.withdrawal(cash);

                    System.out.println("The balance is " + curAcc1.getBalance());

                } else if (choice == 3) {
                    System.out.println("GoodBye");
                } else {
                    System.out.println("Invalid input");
                }
            } while (choice != 3);
            scanner.close();
        }
    }
}
