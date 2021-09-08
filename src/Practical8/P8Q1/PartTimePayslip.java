package Practical8.P8Q1;

public class PartTimePayslip extends Payslip{
    private PartTimeEmployee PTE;
    private int hoursWorked;
    private double MonthlySalary;

    public PartTimePayslip(PartTimeEmployee PTE, int hoursWorked){
        this.PTE=PTE;
        this.hoursWorked=hoursWorked;
        MonthlySalary=calculateMonthlySalary();
    }

    public double calculateMonthlySalary(){
        return PTE.getHrRate()*hoursWorked;
    }

    @Override
    public String toString(){
        return String.format("%sHours Worked: %d\nMonthly Salary: %s\n", PTE.toString(),hoursWorked,MonthlySalary);
    }
}
