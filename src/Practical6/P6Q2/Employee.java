package Practical6.P6Q2;

public class Employee {
    private String name;
    private int yearJoined;
    private double basicSalary;

    public Employee(String name, int yearJoined, double basicSalary){
        this.name=name;
        this.yearJoined=yearJoined;
        this.basicSalary=basicSalary;
    }

    public Employee(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String toString(){
        return String.format("Name: %s\nYear Joined: %d\nBasic Salary: %.2f\n", name,yearJoined,basicSalary);
    }

    public double calculateSalary(){
        return basicSalary;
    }


}
