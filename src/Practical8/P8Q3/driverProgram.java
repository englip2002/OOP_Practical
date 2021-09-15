package Practical8.P8Q3;

import java.util.Scanner;

public class driverProgram {

    public static void main(String[] args) {
        Dispenser[] dispenser = new Dispenser[5];
        dispenser[0] = new Dispenser("Fanta", 2.30, 10);
        dispenser[1] = new Dispenser("Cola", 2.00, 5);
        dispenser[2] = new Dispenser("F&N Soda", 1.50, 3);
        dispenser[3] = new Dispenser("Sarsi", 2.10, 0);
        dispenser[4] = new Dispenser("100 Plus", 2.20, 12);

        MoneyCollector moneyCollector = new MoneyCollector(10.00);

        VendingMachine vendingMachine = new VendingMachine(dispenser, moneyCollector);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < dispenser.length; i++) {
            System.out.println((i + 1) + ") " + dispenser[i].toString());
        }
        System.out.print("Enter your drink Choice: ");
        int drinkChoice = scanner.nextInt() - 1;

        System.out.print("Enter your purchase quantity: ");
        int purchaseQuantity = scanner.nextInt();

        while (dispenser[drinkChoice].getProductStock() - purchaseQuantity < 0) {
            System.out.println("Insufficient Stock Please Re-enter.\n");

            System.out.print("Enter your drink Choice: ");
            drinkChoice = scanner.nextInt() - 1;
    
            System.out.print("Enter your purchase quantity: ");
            purchaseQuantity = scanner.nextInt();
        }

        System.out.println("\nThe total amount is RM"+vendingMachine.calculateGrandTotal(drinkChoice, purchaseQuantity));
        
        System.out.print("Enter your payment Amount: ");
        double paymentAmount = scanner.nextDouble();

        while(paymentAmount<vendingMachine.calculateGrandTotal(drinkChoice, purchaseQuantity)){
            System.out.println("Insufficient Amount! Please Re-enter.\n");
            System.out.print("Enter your payment Amount: ");
            paymentAmount = scanner.nextDouble();
        }

        System.out.println(vendingMachine.purchaseDrink(drinkChoice,purchaseQuantity, paymentAmount));

        System.out.println(vendingMachine.dispense(drinkChoice,purchaseQuantity));

        System.out
                .printf("The remaining money in moneyCollector is RM %.2f",vendingMachine.getMoneyCollector().getMoney());

    }
}
