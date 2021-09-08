package Practical8.P8Q1;

public class PartTimeEmployee extends Employee{

    private static double hrRate = 6.90;

    public PartTimeEmployee(String name, String ID, int age){
        this.name=name;
        this.ID=ID;
        this.age=age;
    }

    public PartTimeEmployee(){};

    public double getHrRate(){
        return hrRate;
    }

    @Override
    public String toString(){
        return String.format("%sHours Rate: %.2f\n", super.toString(),hrRate);
    }
}
