package Practical4.Q1;

public class P4Q1 {
    public static void main(String[] args){
        Employee emp1 =new Employee("David",10000.00);
        emp1.raiseSalary(8);
        System.out.println(emp1.getName()+"'s new salary is RM "+emp1.getSalary());

        //(c)
        Employee emp2 =new Employee("Micheal",12000.00);
        if(emp1.getSalary()>emp2.getSalary()){
            System.out.println("Highest Salary is "+emp1.getName()+" with RM "+emp1.getSalary());
        }
        else{
            System.out.println("Highest Salary is "+emp2.getName()+" with RM "+emp2.getSalary());
        }


    }
}

