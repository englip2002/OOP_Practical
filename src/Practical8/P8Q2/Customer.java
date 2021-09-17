package Practical8.P8Q2;

public class Customer {
    private String custID;
    private String companyName;
    private Address address;


    public Customer(String custID, String companyName, Address address){
        this.custID=custID;
        this.companyName=companyName;
        this.address=address;
    }

    public Customer(){};

    public String getCustID() {
        return custID;
    }

    public String generateAddress(){
        return String.format("         %s\n         %s\n", companyName,address.toString());
    }

    public String toString(){
        return String.format("%-15s %-20s", custID,companyName);
    }

}
