package Practical7.P7Q1;

public class P7Q1 {
    public static void main(String[] args) {
        PatientBill[] patientBills = new PatientBill[4];
        patientBills[0] = new InpatientBill("00001", "John", 30.00, 15.00, 'S', 3);
        patientBills[1] = new InpatientBill("00002", "Cena", 35.00, 16.00, 'P', 2);
        patientBills[2] = new OutpatientBill("00003", "Randy", 25.00);
        patientBills[3] = new OutpatientBill("00004", "Morty", 21.00);

        patientBills=SelectionSort(patientBills);

        for (int i = 0; i < 4; i++) {
            System.out.println(patientBills[i].toString());
        }

        System.out.println("The total Collection is RM" + computeTotalCollection(patientBills));
        

    }

    public static double computeTotalCollection(PatientBill[] patientBills) {
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += patientBills[i].calculateCharge();
        }
        return sum;
    }

    public static PatientBill[] SelectionSort(PatientBill[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int indexOfSmallest=i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j].compareTo(arr[indexOfSmallest])<0){  //means smaller
                    indexOfSmallest=j;
                }
            }
            PatientBill temp=arr[indexOfSmallest];  //smallest 
            arr[indexOfSmallest]=arr[i];     
            arr[i]=temp;
        }
        return arr;
    }
}
