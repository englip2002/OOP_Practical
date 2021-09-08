package Practical8.P8Q1;

public class P8Q1 {
    public static void main(String[] args) {
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
        Payslip[] PTP=new Payslip[3];
        PTP[0]=new PartTimePayslip(PTE[0], 42);
        PTP[1]=new PartTimePayslip(PTE[1], 39);
        PTP[2]=new PartTimePayslip(PTE[2], 45);

        Payslip[] FTP=new Payslip[3];
        FTP[0]=new FullTimePayslip(FTE[0], "Donate");
        FTP[1]=new FullTimePayslip(FTE[1], "Volunteer");
        FTP[2]=new FullTimePayslip(FTE[2], "Donate");

        System.out.println(" ");

        System.out.println(FTP[0].toString());
        System.out.println(PTP[0].toString());

        System.out.println("The Total Donation Fund is "+FullTimePayslip.getDonationFund());
        System.out.println("The Total Number of Volunteer is "+FullTimePayslip.getVolunteerCount()+"\n");
        


        
    }
}
