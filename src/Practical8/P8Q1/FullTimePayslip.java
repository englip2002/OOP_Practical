package Practical8.P8Q1;

public class FullTimePayslip extends Payslip implements Contribution{
    private FullTimeEmployee FTE;
    private double monthlySalary;
    private String contributionChoice;
    private double donateAmount=0;
    private static double donationFund=0;
    private static int volunteerCount=0;

    public FullTimePayslip(FullTimeEmployee FTE){
        this.FTE=FTE;
        this.monthlySalary=calculateMonthlySalary();
    }

    public double calculateMonthlySalary(){
        return FTE.getBasicSalary()+FTE.getAllowance();
    }

    @Override
    public void donate(double donateAmount){
        contributionChoice="Donate";
        this.donateAmount=donateAmount;
        monthlySalary-=donateAmount;
        donationFund+=donateAmount;
    }

    @Override
    public void volunteer(){
        this.contributionChoice="Volunteer";
        volunteerCount++;
    }

    @Override
    public String toString(){
        return String.format("%sContributionChice: %s\nDonate Amount: %.2f\nMonthly Salary: %.2f\n", FTE.toString(),contributionChoice,donateAmount,monthlySalary);
    }

    public static double getDonationFund(){
        return donationFund;
    }

    public static int getVolunteerCount(){
        return volunteerCount;
    }

}