package Practical6.P6Q2;

public class CommissionEmployee extends Employee {
    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(String name, int yearJoined, double basicSalary,double grossSale, double commissionRate){
        super(name, yearJoined, basicSalary);
        this.grossSale=grossSale;
        this.commissionRate=commissionRate;
    }

    public CommissionEmployee(){};

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString(){
        return String.format("%sGross Sale: %.2f\nCommission Rate: %.2f\n", super.toString(),grossSale,commissionRate);
    }

    @Override
    public double calculateSalary(){
        return (super.getBasicSalary()+grossSale)*commissionRate;
    }

}
