package Practical8.P8Q2;

import java.time.LocalDate;

public class Invoice {
    private String invoiceNo;
    private LocalDate date;
    private Customer customer;
    private PurchasedProduct[] purchasedProduct;
    private double grandTotal;
    private static double invoiceCount=0;

    public Invoice(Customer customer, PurchasedProduct[] purchasedProduct){
        this.invoiceNo=generateInvoiceNum();
        this.customer=customer;
        this.purchasedProduct=purchasedProduct;
        this.date=LocalDate.now();
        this.grandTotal=calculateGrandTotal();
        invoiceCount++;
    }

    public Invoice(){};

    public String generateInvoiceNum(){
        return String.format("INV%04d", invoiceCount);
    }

    public String compileProductPurchased(){
        String CompiledProduct=new String();
        for(int i=0;i<purchasedProduct.length;i++){
            CompiledProduct=CompiledProduct.concat(purchasedProduct[i].toString());
        }
        return CompiledProduct;
    }

    public double calculateGrandTotal(){
        double grandTotal=0;
        for(int i=0;i<purchasedProduct.length;i++){
            grandTotal+=purchasedProduct[i].getLineTotal();
        }
        return grandTotal;
    }

    public String generateInvoice(){
        return "                                      INVOICE\n"+
               "                                                       Invoice No :"+invoiceNo+"\n"+
               "                                                       Date       :"+date.toString()+"\n"+
               "                                                       Cust.ID    :"+customer.getCustID()+"\n"+
               "BILL TO:\n"+
               String.format("%s", customer.generateAddress())+
               "----------------------------------------------------------------------------------\n"+
               String.format("%-13s %-20s %-10s %-18s %-16s\n", "Product No","Description","Qty","Unit Price","Line Total(RM)")+
               String.format("%s", compileProductPurchased())+
               "----------------------------------------------------------------------------------\n"+
               String.format("%-70s %.2f", "Grand Total:",grandTotal);

    }
}
