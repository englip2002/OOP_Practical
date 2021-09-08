package Practical8.P8Q1;

public class Employee {
    protected String name;
    protected String ID;
    protected int age;

    public String toString(){
        return String.format("Name: %s\nID: %s\nAge: %d\n", name,ID,age);
    }

}
