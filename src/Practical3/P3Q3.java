package Practical3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P3Q3 {
    // denomination= 面值
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] denomination = { 100, 50, 20, 10, 5, 1 };
        int[] quantity = { 0, 0, 0, 0, 0, 0 };
        int[] value = new int[denomination.length];
        int total = 0;
        
        //ways to declare array
        ArrayList<Integer> num = new ArrayList<Integer>();
        List<Integer> num1=new ArrayList<Integer>();

        System.out.printf("%-15s %-15s\n", "Denomination", "Quantity");
        for (int i = 0; i < denomination.length; i++) {
            // user input
            System.out.printf("%-15d ", denomination[i]);
            quantity[i] = scanner.nextInt();
            // calculate value
            value[i] = calculateValue(denomination[i], quantity[i]);
            total += value[i];
        }
        System.out.println(" ");

        System.out.printf("%-15s %-15s %-15s\n", "Denomination", "Quantity", "value(RM)");
        for (int i = 0; i < denomination.length; i++) {
            System.out.printf("%-15d %-15d %-15d\n", denomination[i], quantity[i], value[i]);
        }

        System.out.println("Total= RM" + total);
        scanner.close();
    }

    public static int calculateValue(int denomination, int qty) {
        return denomination * qty;
    }

}
