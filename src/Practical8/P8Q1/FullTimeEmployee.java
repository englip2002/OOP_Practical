package Practical8.P8Q1;

public class FullTimeEmployee extends Employee{
    private double basicSalary;
    private double allowance;

    public FullTimeEmployee(String name, String ID, int age, double basicSalary, double allowance){
        this.name=name;
        this.ID=ID;
        this.age=age;
        this.basicSalary=basicSalary;
        this.allowance=allowance;
    }

    public FullTimeEmployee(){};

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString(){
        return String.format("%sBasic Salary:%.2f\nAllowance: %.2f\n", super.toString(),basicSalary,allowance);
    }

}
