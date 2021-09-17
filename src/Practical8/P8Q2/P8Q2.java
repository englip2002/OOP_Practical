package Practical8.P8Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class P8Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Address[] address = new Address[3];
        address[0] = new Address("23 Jalan D9", 42100, "Selangor");
        address[1] = new Address("24 Jalan D10", 42100, "Selangor");
        address[2] = new Address("25 Jalan D11", 42100, "Selangor");

        Customer[] cust = new Customer[3];
        cust[0] = new Customer("C00001", "Big Sdn. Bhd.", address[0]);
        cust[1] = new Customer("C00002", "Small Sdn. Bhd.", address[1]);
        cust[2] = new Customer("C00003", "Middle Sdn. Bhd.", address[2]);

        Product[] product = new Product[4];
        product[0] = new Product("1111", "Toaster", 90.00);
        product[1] = new Product("4444", "Television", 3000.00);
        product[2] = new Product("2222", "Electric Iron", 240.00);
        product[3] = new Product("3333", "Air Conditioner", 1200.00);

        int customerChoice = 0;
        // choose company
        System.out.printf("%-15s %-20s\n", "  Customer ID", "Company Name");
        for (int i = 0; i < cust.length; i++) {
            System.out.println((i + 1) + ")" + cust[i].toString());
        }
        System.out.print("Enter your choice on customer: ");
        customerChoice = scanner.nextInt() - 1;
        scanner.nextLine();

        System.out.printf("\n\n%-15s %-20s %-10s\n", "  ProductID", "Product Desc", "Unit Price");
        for (int i = 0; i < product.length; i++) {
            System.out.print((i + 1) + ")" + product[i].toString());
        }

        int productChoice = 0;
        int quantity = 0;

        ArrayList<InvoiceLine> purchasedProduct = new ArrayList<InvoiceLine>();

        System.out.print("Enter your choice on product(-1 to exit): ");
        productChoice = scanner.nextInt() - 1;

        while (productChoice != -1) {
            System.out.print("Enter the quantity: ");
            quantity = scanner.nextInt();
            scanner.nextLine();

            purchasedProduct.add(new InvoiceLine(product[productChoice], quantity));

            System.out.print("Enter your choice on product(0 to exit): ");
            productChoice = scanner.nextInt() - 1;
        }

        Invoice invoice = new Invoice(cust[customerChoice], purchasedProduct);

        System.out.println("\n\n"+invoice.generateInvoice());

        scanner.close();
    }

}
