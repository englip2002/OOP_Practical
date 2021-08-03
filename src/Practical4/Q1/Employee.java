package Practical4.Q1;


public class Employee {
    private String name;
    private double salary;

    // default constructor
    public Employee() {
        name = "";
        salary = 0.0;
    }

    //only recieve name
    public Employee(String employeeName) {
        name = employeeName;
        salary = 0.0;
    }

    //only recieve salary
    public Employee(double currentSalary) {
        salary = currentSalary;
        name = "";
    }

    // parameterized constructor (to initialize variable)
    public Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }

    // setter (to set private data from other file)
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // getter (to get private data from other file)
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    void raiseSalary(double percent) {
        salary = salary + (salary * percent / 100.0);
    }
    
}
