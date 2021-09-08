package Practical8.P8Q1;

import java.util.Scanner;

public class FullTimePayslip extends Payslip implements Contribution{
    private FullTimeEmployee FTE;
    private double monthlySalary;
    private String contributionChoice;
    private double totalDonate=0;
    private static double donationFund=0;
    private static int volunteerCount=0;

    public FullTimePayslip(FullTimeEmployee FTE, String ContributionChoice){
        this.FTE=FTE;
        this.monthlySalary=calculateMonthlySalary();
        
        if(ContributionChoice.equalsIgnoreCase("donate"))
            donate();
        else
            volunteer();
  
    }

    public double calculateMonthlySalary(){
        return FTE.getBasicSalary()+FTE.getAllowance();
    }

    @Override
    public void donate(){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter Donate Amount for "+FTE.name+": ");
        totalDonate=scanner.nextDouble();

        contributionChoice="Donate";
        monthlySalary-=totalDonate;
        donationFund+=totalDonate;
        scanner.close();
    }

    @Override
    public void volunteer(){
        this.contributionChoice="Volunteer";
        volunteerCount++;
    }

    @Override
    public String toString(){
        return String.format("%sContributionChice: %s\nDonate Amount: %.2f\nMonthly Salary: %.2f\n", FTE.toString(),contributionChoice,totalDonate,monthlySalary);
    }

    public static double getDonationFund(){
        return donationFund;
    }

    public static int getVolunteerCount(){
        return volunteerCount;
    }

}