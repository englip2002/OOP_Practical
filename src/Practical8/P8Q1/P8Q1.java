package Practical8.P8Q1;

import java.util.Scanner;

public class P8Q1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //employee
        PartTimeEmployee[] PTE=new PartTimeEmployee[3];
        PTE[0]=new PartTimeEmployee("Chan", "PTE001", 18);
        PTE[1]=new PartTimeEmployee("Kok", "PTE002", 19);
        PTE[2]=new PartTimeEmployee("Tan", "PTE003", 20);

        FullTimeEmployee[] FTE=new FullTimeEmployee[3];
        FTE[0]=new FullTimeEmployee("Sin", "FTE001", 21, 2300, 500);
        FTE[1]=new FullTimeEmployee("Chiew", "FTE002", 22, 2300, 500);
        FTE[2]=new FullTimeEmployee("Chooi", "FTE003", 23, 2300, 500);


        //payslip
        PartTimePayslip[] PTP=new PartTimePayslip[3];
        PTP[0]=new PartTimePayslip(PTE[0], 42);
        PTP[1]=new PartTimePayslip(PTE[1], 39);
        PTP[2]=new PartTimePayslip(PTE[2], 45);

        FullTimePayslip[] FTP=new FullTimePayslip[3];
        FTP[0]=new FullTimePayslip(FTE[0]);
        FTP[1]=new FullTimePayslip(FTE[1]);
        FTP[2]=new FullTimePayslip(FTE[2]);

        for(int i=0;i<FTP.length;i++){
            System.out.println(FTE[i].toString());
            System.out.println("Choice of Contribution");
            System.out.println("1.Donate");
            System.out.println("2.Volunteer");
            System.out.print("Enter your choice: ");
            int choice=scanner.nextInt();
            if(choice==1){
                System.out.print("Enter Donate Amount: ");
                double donateAmount=scanner.nextDouble();
                FTP[i].donate(donateAmount);
            }
            else{
                FTP[i].volunteer();
            }

            System.out.println("\n");
        }

        System.out.println("Full Time Employee Payslip");
        for(int i=0;i<FTP.length;i++){
            System.out.println(FTP[i].toString());
        }

        System.out.println("Part Time Employee Payslip");
        for(int i=0;i<PTP.length;i++){
            System.out.println(PTP[i].toString());
        }

        System.out.println("The Total Donation Fund is "+FullTimePayslip.getDonationFund());
        System.out.println("The Total Number of Volunteer is "+FullTimePayslip.getVolunteerCount()+"\n");
        


        
    }
}
