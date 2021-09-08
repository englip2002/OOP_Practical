package Practical8.P8Q2;

public class Customer {
    private String custID;
    private String companyName;
    private String address;
    private int postcode;
    private String state;

    public Customer(String custID, String companyName, String address,int postcode,String state){
        this.custID=custID;
        this.companyName=companyName;
        this.address=address;
        this.postcode=postcode;
        this.state=state;
    }

    public Customer(){};

    public String getCustID() {
        return custID;
    }

    public String generateAddress(){
        return String.format("         %s\n         %s\n         %05d\n         %s\n", companyName,address,postcode,state);
    }

}
