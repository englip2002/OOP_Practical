package Practical7.P7Q1;

abstract class PatientBill implements Comparable {
    protected String visitID;
    protected String name;

    abstract double calculationCharge();

    public String toString() {
        return String.format("Visit ID: %s\nName: %s\n", visitID, name);
    }

    @Override
    public boolean compareTo(Object obj) {
        if (obj instanceof PatientBill) {
            return this.name.equals(((PatientBill) obj).name);
        }
        return false;
    }
}
