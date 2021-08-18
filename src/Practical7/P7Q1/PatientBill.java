package Practical7.P7Q1;

abstract class PatientBill {
    protected String visitID;
    protected String name;

    abstract double calculationCharge();

    public String toString(){
        return String.format("Visit ID: %s\nName: %s\n",visitID,name);
    }
}
