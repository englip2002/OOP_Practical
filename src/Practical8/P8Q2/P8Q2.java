package Practical8.P8Q2;

public class P8Q2 {
    public static void main(String[] args) {
        Customer cust=new Customer("C72635","Big Sdn. Bhd.", "23 Jalan D9", 42100, "Selangor");
        Product[] product=new Product[2];
        product[0]=new Product("1111", "Toaster", 90.00);
        product[1]=new Product("4444", "Television", 3000.00);

        PurchasedProduct[] purchasedProduct=new PurchasedProduct[2];
        purchasedProduct[0]=new PurchasedProduct(product[0], 1);
        purchasedProduct[1]=new PurchasedProduct(product[1], 1);


        Invoice invoice=new Invoice(cust, purchasedProduct);

        System.out.println(invoice.generateInvoice());
    }


    
}
