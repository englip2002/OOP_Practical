package Practical4.Q4;

public class CarType {
    private String make;
    private String model;
    private double capacity;

    public CarType(){}

    public CarType(String make, String model, double capacity){
        this.make=make;
        this.model=model;
        this.capacity=capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String toString(){
        return String.format("%-10s %-10s %-5s",make,model,capacity);
    }

}
