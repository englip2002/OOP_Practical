package Practical8.P8Q2;



public class Address {
    private String address;
    private int postcode;
    private String state;

    public Address( String address,int postcode,String state){
        this.address=address;
        this.postcode=postcode;
        this.state=state;
    }

    public String toString(){
        return String.format("%s\n         %05d\n         %s\n", address,postcode,state);
    }
}
