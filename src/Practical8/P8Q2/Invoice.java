package Practical8.P8Q2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Invoice {
    private String invoiceNo;
    private LocalDate date;
    private Customer customer;
    private ArrayList<InvoiceLine> purchasedProduct;
    private double grandTotal;
    private static int invoiceCount=0;

    public Invoice(Customer customer, ArrayList<InvoiceLine> purchasedProduct){
        this.invoiceNo=String.format("INV%04d", invoiceCount);
        this.customer=customer;
        this.purchasedProduct=purchasedProduct;
        this.date=LocalDate.now();
        this.grandTotal=calculateGrandTotal();
        invoiceCount++;
    }

    public Invoice(){};


    public String compileProductPurchased(){
        String CompiledProduct=new String();
        for(int i=0;i<purchasedProduct.size();i++){
            CompiledProduct=CompiledProduct.concat(purchasedProduct.get(i).toString());
        }
        return CompiledProduct;
    }

    public double calculateGrandTotal(){
        double grandTotal=0;
        for(int i=0;i<purchasedProduct.size();i++){
            grandTotal+=purchasedProduct.get(i).getLineTotal();
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
