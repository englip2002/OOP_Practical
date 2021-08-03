package Practical4.Q4;

public class Car {
    private String plateNo;
    private String colour;
    private int year;
    private CarType carType;

    public Car() {
    }

    public Car(String plateNo, String colour, int year, CarType carType) {
        this.plateNo = plateNo;
        this.colour = colour;
        this.year = year;
        this.carType=carType;
    }


    public String toString(){
        return String.format("%-10s %-10s %-10d %-25s",plateNo,colour,year,carType);
    }

}
