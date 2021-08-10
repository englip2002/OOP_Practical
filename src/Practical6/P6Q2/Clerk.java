package Practical6.P6Q2;

public class Clerk extends Employee {
    private double allowance;
    private int overtimeHours;
    private static double overtimeRate=10;

    public Clerk(String name, int yearJoined, double basicSalary, double allowance, int overtimeHours) {
        super(name, yearJoined, basicSalary);
        this.allowance = allowance;
        this.overtimeHours = overtimeHours;
    }

    public Clerk(){};

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public String toString(){
        return String.format("%sAllowance: %.2f\nOvertime Hours: %d\nOvertime Rate:%.2f per hour\n", super.toString(),allowance,overtimeHours,overtimeRate);
    }

    @Override
    public double calculateSalary(){
        return getBasicSalary()+allowance+(overtimeHours*overtimeRate);
    }

}
