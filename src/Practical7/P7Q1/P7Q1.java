package Practical7.P7Q1;

public class P7Q1 {
    public static void main(String[] args) {
        PatientBill[] patientBills = new PatientBill[4];
        patientBills[0] = new InpatientBill("00001", "John", 30.00, 15.00, 'S', 3);
        patientBills[1] = new InpatientBill("00002", "Cena", 35.00, 16.00, 'P', 2);
        patientBills[2] = new OutpatientBill("00003", "Randy", 25.00);
        patientBills[3] = new OutpatientBill("00004", "Morty", 21.00);

        for (int i = 0; i < 4; i++) {
            System.out.println(patientBills[i].toString());
        }

    }

    public double computeTotalCollection(PatientBill[] patientBills){
        double sum=0;
        for(int i=0;i<4;i++){
            sum+=patientBills[i].calculationCharge();
        }
        return sum;
    }
}
