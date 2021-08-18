package Practical7.P7Q1;

public class OutpatientBill extends PatientBill {
    private static double registrationFee=30;
    private double consultationFee;

    public OutpatientBill(String visitID, String  name, double consultationFee){
        this.visitID=visitID;
        this.name=name;
        this.consultationFee=consultationFee;
    }

    public OutpatientBill(){};

    @Override
    public double calculationCharge(){
        return registrationFee+consultationFee;
    }

    @Override
    public String toString(){
        return String.format("%sRegistration Fee: %.2f\nConsultation Fee: %.2f\nTotal: %.2f\n", super.toString(),registrationFee,consultationFee,calculationCharge());
    }
}
