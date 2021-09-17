package Practical8.P8Q2;

public class Product {
    private String productNo;
    private String description;
    private double unitPrice;

    public Product(String productNo,String description,double unitPrice){
        this.productNo=productNo;
        this.description=description;
        this.unitPrice=unitPrice;
    }

    public Product(){};
    
    public String getProductNo() {
        return productNo;
    }

    public String getDescription() {
        return description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String toString(){
        return String.format("%-15s %-20s %-10.2f\n", productNo,description,unitPrice);
    }

}
