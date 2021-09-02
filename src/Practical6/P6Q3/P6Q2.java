package Practical6.P6Q3;

public class P6Q2 {
    public static void main(String[] args) {
        Employee[] Emp = new Employee[3];
        Emp[0] = new Employee("Tan", 2012, 1999.99);
        Emp[1] = new CommissionEmployee("Chan", 2013, 1858.00, 100, 0.3);
        Emp[2] = new Clerk("John", 2014, 1000, 50, 12);
        //to use method from CommissionEmployee, else can only use method from Employee
        ((CommissionEmployee) Emp[1]).getGrossSale(); 
    
        printElements(Emp);
    }

    public static void printElements(Employee[] Emp) {
        for (int i = 0; i < 3; i++) {
            if (Emp[i] instanceof CommissionEmployee)
                System.out.println("Type : Commission Employee");
            else if (Emp[i] instanceof Clerk)
                System.out.println("Type : Clerk");
            else
                System.out.println("Type : Employee");

            System.out.println(Emp[i].toString());
            System.out.println();
        }
    }
}
