package Practical7.P7Q1;

abstract class PatientBill implements Comparable {
    protected String visitID;
    protected String name;

    abstract double calculateCharge();

    public String toString() {
        return String.format("Visit ID: %s\nName: %s\n", visitID, name);
    }

    @Override
    public int compareTo(Object obj) {
        return this.name.compareTo(((PatientBill) obj).name);

    }
}
