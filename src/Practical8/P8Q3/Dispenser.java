package Practical8.P8Q3;

public class Dispenser {
    private String productName;
    private double price;
    private int productStock;

    public Dispenser(){};
    public Dispenser(String productName,double price,int productStock){
        this.productName=productName;
        this.price=price;
        this.productStock=productStock;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getProductStock() {
        return productStock;
    }


    public String toString(){
        return String.format("%-10s %-10.2f %d", productName,price,productStock);
    }

}
