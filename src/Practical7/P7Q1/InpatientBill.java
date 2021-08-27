package Practical7.P7Q1;

public class InpatientBill extends PatientBill {
    private double specialistCharges;
    private double labCharges;
    private Character roomType;
    private int durationOfStay;
    private double roomRate;

    public InpatientBill() {
    };

    public InpatientBill(String visitID, String name, double specialistCharges, double labCharges, Character roomType,
            int durationOfStay) {
        this.visitID = visitID;
        this.name = name;
        this.specialistCharges = specialistCharges;
        this.labCharges = labCharges;
        this.roomType = roomType;
        this.durationOfStay = durationOfStay;

        if (roomType.equals('S'))
            roomRate = 100.00;
        else
            roomRate = 200.00;
    }

    @Override
    public double calculateCharge() {
        return specialistCharges + labCharges + (durationOfStay * roomRate);
    }

    @Override
    public String toString() {
        return String.format("%sSpecialist Charge: %.2f\nLab Charges: %.2f\nRoom Charges(%c): %.2f\nTotal: %.2f\n",
                super.toString(), specialistCharges, labCharges, roomType, (durationOfStay * roomRate),
                calculateCharge());
    }
}
