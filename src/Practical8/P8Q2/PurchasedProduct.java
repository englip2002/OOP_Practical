package Practical8.P8Q2;

public class PurchasedProduct {
    private Product products;
    private int Qty;
    private double lineTotal;

    public PurchasedProduct(Product products,int Qty){
        this.products=products;
        this.Qty=Qty;
        this.lineTotal=calculateLineTotal();
    };

    public PurchasedProduct(){};

    public double getLineTotal(){
        return lineTotal;
    }

    private double calculateLineTotal(){
        return products.getUnitPrice()*Qty;
    }

    public String toString(){
        return String.format("%-13s %-21s %-9d %10.2f %21.2f\n", products.getProductNo(),products.getDescription(),Qty,products.getUnitPrice(),lineTotal);
    }


}
